import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Boj_1758 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    // 손님의 수
        Integer[] tips = new Integer[n];

        for (int i = 0; i < n; i++) {
            tips[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(tips, Collections.reverseOrder());

        long total = 0; // 총 적립금액

        for (int i = 0; i < n; i++) {
            long tip = tips[i] - i; //각 손님의 팁
            if (tip > 0) {
                total += tip;
            }
        }
        System.out.println(total);
    }
}

