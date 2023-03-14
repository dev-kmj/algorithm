
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Boj_1644 {
    static int prime[];
    static ArrayList<Integer> primes = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 소수 구하기
        prime = new int[n + 1];
        prime[0] = prime[1] = 0;

        // 에라토스테네스의 체 
        // 2부터 소수인지 판별하고자 하는 구간의 모든 수 나열
        for (int i = 2; i <= n; i++) {
            prime[i] = i;
        }

        for (int i = 2; i < n; i++) {
            if (prime[i] == 0) continue;    // 소수가 아니라면 continue
            for (int j = 2 * i; j <= n; j += i) {
                prime[j] = 0;   // 소수의 배수는 소수를 약수로 가지므로 제외
            }
        }

        for (int i = 1; i <= n; i++) {
            if (prime[i] != 0) {
                primes.add(i);
            }
        }

        // 연속합으로 주어진 정수 구할 수 있는지 판별
        int start = 0, end = 0, sum = 0, count = 0;
        while (true) {
            if (sum >= n) {
                sum -= primes.get(start++);
            } else if (end == primes.size()) {
                break;
            } else {
                sum += primes.get(end++);
            }
            if (sum == n) count++;
        }
        System.out.println(count);
    }
}
