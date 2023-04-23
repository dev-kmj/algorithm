import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = 0;
        int sum = arr[0];
        int cnt = 0;    // 부분 수열 개수

        while (end < n) {
            if (sum == m) {
                cnt++;
                sum -= arr[start++];
            } else if (sum < m) {
                end++;
                if (end < n) {
                    sum += arr[end];    // 합에 끝점 값 추가
                }
            } else {
                sum -= arr[start++];
            }
        }

        System.out.println(cnt);
}    
