import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr;
        int testcase = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < testcase; i++) {
            st = new StringTokenizer(br.readLine(), " ");   // 학생 수와 성적 입력

            int n = Integer.parseInt(st.nextToken());   // 학생 수
            arr = new int[n];
            double sum = 0;

            // 성적 입력
            for (int j = 0; j < n; j++) {
                int score = Integer.parseInt(st.nextToken());
                arr[j] = score;
                sum += score;   // 성적 누적 합
            }

            double avg = sum / n;
            double count = 0;   // 평균 넘는 학생 수

            for (int j = 0; j < n; j++) {
                if (arr[j] > avg) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n", (count / n) * 100);
        }
    }
}
