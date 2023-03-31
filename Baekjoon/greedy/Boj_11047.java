import java.io.*;
import java.util.StringTokenizer;

public class Boj_11047 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 동전 종류 개수
        int k = Integer.parseInt(st.nextToken());   // 동전 가치

        int[] coins = new int[n];

        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine()); // 각 동전의 가치
        }

        int count = 0;  // 필요한 동전 개수
        int idx = n - 1;  // 현재 검사하는 동전의 인덱스

        while (k > 0) {
            if (k >= coins[idx]) {
                count += k / coins[idx];
                k %= coins[idx];
            }
            idx--;
        }
        System.out.println(count);
    }
}

