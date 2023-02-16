import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_11399 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int answer = 0; // 최소가 되어야 하는 합 (걸리는 시간의 총합)
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            answer += sum;
        }
        System.out.println(answer);
    }
}

