import java.io.*;
import java.util.StringTokenizer;

public class Boj_20922 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] count = new int[100001];
        int start = 0;
        int end = 0;
        int maxLength = 0;

        while (end < N) {
            int current = arr[end];
            count[current]++;

            while (count[current] > K) {
                 count[arr[start]]--;
                 start++;
            }

            maxLength = Math.max(maxLength, end - start + 1); 
            end++;
        }

        System.out.println(maxLength);
    }
}
