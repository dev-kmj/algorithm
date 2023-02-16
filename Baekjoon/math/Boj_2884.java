import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2884 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st =  new StringTokenizer(str ," ");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        if (m < 45) {
            h--;
            m = 60 - (45 - m);

            if (h < 0) {
                h = 23;
            }

            System.out.println(h + " " + m);
        } else {
            System.out.println(h + " " + (m - 45));
        }
    }
}
