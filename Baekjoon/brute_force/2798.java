import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = search(n, m, arr);
        System.out.println(answer);
    }

    // 탐색
    static int search(int n, int m, int[] arr) {

        int answer = 0;

        // 3개를 고르기 때문에 첫 번째 카드는 n - 2까지만 순회
        for (int i = 0; i < n - 2; i++) {
            // 두 번째 카드는 i+1부터 n-1까지 순회
            for (int j = i + 1; j < n - 1; j++) {
                // 세 번째 카드는 j+1부터 n까지 순회
                for (int k = j + 1; k < n; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    
                    // m과 sum이 같다면 sum을 return
                    if (m == sum) {
                        return sum;
                    }

                    // m과 숫자 3개의 합이 같다면 return 및 종료
                    if (answer < sum && sum < m) {
                        answer = sum;
                    }
                }
            }
        }
        return answer;
    }
}
