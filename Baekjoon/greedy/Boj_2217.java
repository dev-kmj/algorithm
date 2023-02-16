import java.io.*;
import java.util.Arrays;

public class Boj_2217 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] ropes = new int[n];
        int res = 0;

        for (int i = 0; i < n; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ropes);
        res = ropes[0] * n;

        for (int i = 1; i < n; i++) {
            if (ropes[i] * (n - i) > res) {
                res = ropes[i] * (n - i);
            }
        }

        System.out.println(res);
    }
}
