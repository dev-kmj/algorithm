import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_14888 {
    public static int MAX = Integer.MIN_VALUE;
    public static int MIN = Integer.MAX_VALUE;
    public static int N;
    public static int[] num;
    public static int[] operator = new int[4];  // 연산자 개수


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        num = new int[N];

        // 숫자 입력
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        // 연산자 입력
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        dfs(num[0], 1);

        System.out.println(MAX);
        System.out.println(MIN);
    }

    public static void dfs(int n, int idx) {
        if (idx == N) {
            MAX = Math.max(MAX, n);
            MIN = Math.min(MIN, n);
            return;
        }

        for (int i = 0; i < 4; i++) {
            // 연산자가 존재하는 경우
            if (operator[i] > 0) {

                // 해당 연산자를 1 감소시킴
                operator[i]--;

                switch (i) {
                    case 0 : dfs(n + num[idx], idx + 1); break;
                    case 1 : dfs(n - num[idx], idx + 1); break;
                    case 2 : dfs(n * num[idx], idx + 1); break;
                    case 3 : dfs(n / num[idx], idx + 1); break;
                }

                // 연산자 개수 복구
                operator[i]++;
            }
        }
    }
}
