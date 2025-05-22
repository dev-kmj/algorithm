import java.io.*;
import java.util.StringTokenizer;

public class Boj_2343 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] lectures = new int[n];
        int maxLecture = 0; // 강의 길이 중 최대값
        long totalLength = 0;  // 강의 길이의 합

        for (int i = 0; i < n; i++) {
            lectures[i] = Integer.parseInt(st.nextToken());
            maxLecture = Math.max(maxLecture, lectures[i]);
            totalLength += lectures[i];
        }

        // 이분탐색
        int left = maxLecture; // 블루레이의 최소 크기
        int right = (int)totalLength; // 블루레이의 최대 크기

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isPossible(lectures, n, m, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // left > right 가 되어 이분탐색이 종료된 시점에서 left는 우리가 찾는 정답 (가능한 최소 블루레이 크기)이 된다.
        System.out.println(left);
    }

    // 블루레이 크기가 size일 때 m개로 가능한지
    private static boolean isPossible(int[] lectures, int n, int m, int size) {
        int count = 1;
        int sum = 0;

        for (int lecture : lectures) {
            // 현재 강의를 추가했을 때 size를 초과하는 경우
            if (sum + lecture > size) {
                count++;
                sum = lecture;

                // 블루레이 개수가 m을 초과하면 불가능
                if (count > m) {
                    return false;
                }
            } else {
                sum += lecture;
            }
        }
        return true;
    }

}
