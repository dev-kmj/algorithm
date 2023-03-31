import java.io.*;

public class Boj_14916 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    
        int count = 0;

        while (n > 0) {
            if (n % 5 == 0) {
                count += n / 5;
                n = 0;
            } else if (n < 2) {
                count = -1;
                n = 0;
            } else {
                n -= 2;
                count++;
            }
        }
        System.out.println(count);
    }
}

