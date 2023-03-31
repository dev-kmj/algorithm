import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine());
        int[] p = new int[r];

        for (int i = 0; i < r; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            p[i] = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            for (int j = 0; j < str.length(); j++) {
                for(int k = 0; k < p[i]; k++) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
