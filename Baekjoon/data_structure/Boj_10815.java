import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Boj_10815 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 상근이가 가지고 있는 카드 수 n 입력
        int n = Integer.parseInt(br.readLine());

        // 상근이의 카드를 HashSet에 저장
        HashSet<Integer> cardSet = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            cardSet.add(Integer.parseInt(st.nextToken()));
        }

        // 찾을 숫자의 개수 m 입력
        int m = Integer.parseInt(br.readLine());

        //m개의 숫자에 대해 존재 여부 확인
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
            // cardSet에 존재하면 1, 없으면 0 추가
            sb.append(cardSet.contains(target) ? 1 : 0).append(' ');
        }

        System.out.println(sb.toString());
    }
}
