import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = 0;

        for (int i = 0; i < n; i++) {
            int num = i;
            int sum = 0;    // 각 자리수 합

            while (num != 0) {
                sum += num % 10;    // 각 자리수 더하기
                num /= 10;
            }

            // i + 각자리숫자 누적합이 입력값과 같은 경우 (= 생성자를 찾은 경우)
            if (sum + i == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
