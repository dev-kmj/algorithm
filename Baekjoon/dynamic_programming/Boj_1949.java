import java.util.Scanner;

public class Boj_1949 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] dp;
        int[] files;
        int[] sum;
        int N;
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            N = sc.nextInt();
            dp = new int[N+1][N+1];
            files = new int[N+1];
            sum = new int[N+1];

            for (int i = 1; i <= N; i++) {
                files[i] = sc.nextInt();
                sum[i] = sum[i - 1] + files[i];
            }

            for (int dist = 1; dist <= N; dist++) {
                for (int start = 1; start + dist <= N; start++) {
                    int end = start + dist;
                    dp[start][end] = Integer.MAX_VALUE;

                    // x : 파일을 합칠 때, 시작 지점에 따라 값이 달라짐.
                    //파일 합치기 하는 시점을 다르게 해서 최소값을 찾는다.
                    for (int x = start; x < end; x++) {
                        dp[start][end] = Math.min(dp[start][end], dp[start][x] + dp[x+1][end] + sum[end] - sum[start - 1]);
                    }
                }
            }

            System.out.println(dp[1][N]);
        }
    }
}
