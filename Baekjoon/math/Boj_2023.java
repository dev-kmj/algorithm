import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2023 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dfs(0, n);
    }

    static void dfs(int num, int n) {
        if (n == 0) {
            System.out.println(num);
        }

        for (int i = 1; i < 10; i++) {
            int tmp = 10 * num + i;
            if (n > 0 && isPrime(tmp)) {
                dfs(tmp, n-1);
            }
        }
    }

    static boolean isPrime(int n) {
        if(n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;   // i가 n의 약수면 n은 소수가 아니다.
            }
        }
        return true;
    }
}
