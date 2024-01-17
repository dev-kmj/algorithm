
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Boj_18353 {

    static int n;
    static ArrayList<Integer> p = new ArrayList<>();
    static int[] dp = new int[2000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            p.add(sc.nextInt());
        }

        //전투력 배열을 뒤집어 LIS 이용
        Collections.reverse(p);

        //DP를 위해 1차원 DP 테이블 초기화
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (p.get(j) < p.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        //열외해야 하는 병사의 최소 수 출력
        int maxValue = 0;
        for (int i = 0; i < n; i++) {
            maxValue = Math.max(maxValue, dp[i]);
        }
        System.out.println(n - maxValue);
    }
}
