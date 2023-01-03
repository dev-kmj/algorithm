import java.io.*;
import java.util.Arrays;

public class Main {
    private static int t, n, m;
    private static int[] arr, coins;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t  = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            m = Integer.parseInt(br.readLine());

            coins = new int[m + 1];
            coins[0] = 1;
            for (int coin : arr) {
                for (int j = coin; j <= m; j++) {
                    coins[j] += coins[j - coin];
                }
            }
            sb.append(coins[m]).append("\n");
        }
        System.out.println(sb.toString());
    }
}
