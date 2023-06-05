import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2607 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int length = s.length();
        int[] alphabet = new int[26];
        int[] check;
        int answer = 0;

        // 기준값 알파벳 개수 세기
        for (int i = 0; i < length; i++) {
            alphabet[s.charAt(i) - 'A']++;
        }

        // 나머지 단어 확인
        for (int i = 0; i < n - 1; i++) {
            check = alphabet.clone();
            String cur = br.readLine();

            // 길이 차이가 1이 넘으면 비슷한 단어가 될 수 없음
            if (Math.abs(cur.length() - s.length()) > 1) continue;

            // 기준값과 같은 알파벳 개수
            int cnt = 0;

            // 알파벳 비교
            for (int j = 0; j < cur.length(); j++) {

                if (check[cur.charAt(j) - 'A'] > 0) {
                    cnt++;
                    // 중복체크 방지
                    check[cur.charAt(j) - 'A']--;
                }
            }

            // 조건 비교
            if (s.length() - 1 == cur.length() && s.length() - 1 == cnt) {
                answer++;
            }

            else if (s.length() + 1 == cur.length() && s.length() == cnt) {
                answer++;
            }

            else if (s.length() == cur.length() && (cur.length() == cnt || cur.length() - 1 == cnt)) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
