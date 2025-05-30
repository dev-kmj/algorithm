import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1439 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int group0 = 0;
        int group1 = 0;

        if (s.charAt(0) == '0') group0++;
        else group1++;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                if (s.charAt(i) == '0') group0++;
                else group1++;
            }
        }

        System.out.println(Math.min(group0, group1));
    }
}
