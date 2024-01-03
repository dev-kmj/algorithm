import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1543 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String document = br.readLine();
        String word = br.readLine();

        int count = 0;
        int index = 0;

        while ((index = document.indexOf(word, index)) != -1) {
            count++;
            index += word.length();
        }

        System.out.println(count);
    }
}
