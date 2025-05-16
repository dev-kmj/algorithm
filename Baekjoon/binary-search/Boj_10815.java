import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Boj_10815 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb  = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] cards = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);

        // 비교할 숫자 카드 입력
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(cards, target)).append(' ');
        }

        System.out.println(sb.toString());
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return 1;
            } else if (arr[mid] < target) {
                left = mid + 1;     // 오른쪽 반 탐색
            } else {
                right = mid - 1;    // 왼쪽 반 탐색
            }
        }

        return 0;   // 못 찾으면 0 반환
    }

}
