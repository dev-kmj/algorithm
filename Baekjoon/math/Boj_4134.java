import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_4134 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(br.readLine());
            
            while (true) {
                
                boolean isPrime = true;
                
                for (long j = 2; j*j <= n; j++) {
                    if (n % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                
                if (n >= 2 && isPrime) {
                    sb.append(n).append("\n");
                    break;
                }
                n++;
            }
        }
        System.out.println(sb);
    }
}
