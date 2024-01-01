import java.io.*;
import java.util.StringTokenizer;

public class Boj_11501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int[] num;
        StringTokenizer st;

        for (int t = 0; t < tc; t++) {
            int n = Integer.parseInt(br.readLine());
            long answer = 0;
            st = new StringTokenizer(br.readLine(), " ");
            num = new int[n];

            //시세 정보 저장
            for (int i = 0; i < n; i++) {
                num[i] = Integer.parseInt(st.nextToken());
            }
            int max = num[n - 1];   //마지막 값을 최고 시세로 설정

            //역방향 탐색
            for (int i = n - 2; i >= 0; i--) {
                if (num[i] <= max) {
                    answer += max - num[i];
                } else {
                    max = num[i];
                }
            }
            System.out.println(answer);
        }
    }
}
