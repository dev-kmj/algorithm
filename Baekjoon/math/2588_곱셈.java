import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        System.out.println(A * (B % 100 % 10)); // 10으로 나눈 나머지 (= 일의자리)
        System.out.println(A * (B % 100 / 10)); // 100으로 나눈 값의 나머지를 10으로 나눈 몫 (= 10의 자리)
        System.out.println(A * (B / 100));  // 100으로 나눈 몫 (= 100의 자리)
        System.out.println(A * B);
    }
}
