import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_16171 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String word = "";
        String find = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) - '0' >= 0 && str.charAt(i) - '0' <= 9))
                word += str.charAt(i);
        }
        System.out.println(word.indexOf(find) != -1 ? 1 : 0);
    }
}
