import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_14501 {
    static int n;
    static int[] t = new int[15];   // 각 상담 완료 기간
    static int[] p = new int[15];   // 상담 완료시 받는 금액
    static int[] dp = new int[16];  // 다이나믹 프로그래밍을 위한 테이블 초기화
    static int maxValue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }

        // 배열을 뒤에서부터 확인
        for (int i = n - 1; i >= 0; i--) {
            int time  = t[i] + i;
            // 상담이 기간 안에 끝나는 경우
            if (time <= n) {
                // 점화식을 사용해서 현재까지 얻을 수 있는 최대 이익 계산
                dp[i] = Math.max(p[i] + dp[time], maxValue);
                maxValue = dp[i];
            }
            else dp[i] = maxValue;
        }
        System.out.println(maxValue);
    }
}
