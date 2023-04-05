import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2960 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        boolean[] primes = new boolean[n+1];    // 소수인지 여부를 저장
        int count = 0;

        // 에라토스테네스의 체 알고리즘
        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {   // 아직 지워지지 않은 경우
                for (int j = i; j <= n; j+= i) {
                    if (!primes[j]) {   // 이미 지워진 숫자는 제외
                        primes[j] = true;
                        count++;
                    }

                    // k번재 지워진 숫자를 찾으면 해당 숫자 출력 후 종료
                    if (count == k) {
                        System.out.println(j);
                        return;
                    }
                }
            }
        }

    }
}
