import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;


public class Boj_1446 {
    static class ShortCut {
        int end;
        int distance;

        public ShortCut(int end, int distance) {
            this.end = end;
            this.distance = distance;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        // 지름길 정보를 시작 위치별로 저장
        List<ShortCut>[] shortcuts = new ArrayList[d + 1];
        for (int i = 0; i <= d; i++) {
            shortcuts[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());

            if (end <= d && end - start > distance) {
                shortcuts[start].add(new ShortCut(end, distance));
            }
        }

        // dp[i] = 0부터 i까지 가는 최소 거리
        int[] dp = new int[d + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i <= d; i++) {

            if (i < d) {
                dp[i + 1] = Math.min(dp[i + 1], dp[i] + 1);
            }

            // 지름길로 가는 경우
            for (ShortCut sc : shortcuts[i]) {
                dp[sc.end] = Math.min(dp[sc.end], dp[i] + sc.distance);
            }
        }
        System.out.println(dp[d]);
    }
}
