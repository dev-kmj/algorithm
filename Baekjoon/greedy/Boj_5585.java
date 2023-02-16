import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_5585 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int price = Integer.parseInt(br.readLine());

        int[] coin = {500, 100, 50, 10, 5, 1};
        price = 1000 - price;

        int num = 0;
        for (int i = 0; i < 6; i++) {
            if (price/coin[i] > 0) {
                num += price / coin[i];
                price = price % coin[i];
            }
        }
        System.out.println(num);
    }
}

