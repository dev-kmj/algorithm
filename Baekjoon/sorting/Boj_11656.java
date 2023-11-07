import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        String[] strArray = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            strArray[i] = s.substring(i, s.length());
        }

        Arrays.sort(strArray);

        for (String suffix : strArray) {
            System.out.println(suffix);
        }
    }
}
