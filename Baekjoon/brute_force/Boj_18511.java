import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_18511 {

    private static int[] num;
    private static int n;
    private static int k;
    private static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        num = new int[k];
        for (int i = 0; i < k; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);
        dfs(0);
        System.out.println(answer);
    }

    private static void dfs(int cur) {
        if (cur > n) return;
        if (answer < cur) answer = cur;
        for (int i = k-1; i > -1; i--) {
            dfs(cur * 10 + num[i]);
        }
    }
}
