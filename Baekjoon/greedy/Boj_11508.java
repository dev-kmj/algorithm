import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class  {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] goods = new Integer[n];

        for (int i = 0; i < n; i++) {
            goods[i] = Integer.valueOf(br.readLine());
        }
        // 내림차순 정렬
        Arrays.sort(goods, Comparator.reverseOrder());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 3 == 0) continue;
            sum += goods[i];
        }
        System.out.println(sum);

    }
}
