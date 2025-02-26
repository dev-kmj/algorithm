import java.util.Scanner;

public class Boj_7568 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] h = new int[n];
        int[] w = new int[n];
        int[] rank = new int[n];

        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            h[i] = sc.nextInt();
            rank[i] = 1;    // 본인은 처음에 1등으로 시작
        }

        // 완전탐색 - 각 사람들을 나머지 모든 사람들과 비교
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (w[i] < w[j] && h[i] < h[j]) {
                    rank[i]++;  // 덩치가 더 큰 사람이 있으면 나의 덩치 등수 증가
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(rank[i] + " ");
        }
    }
}
