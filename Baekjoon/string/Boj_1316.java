import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        int count = 0;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            if (check() == true) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check() throws IOException {
        boolean[] check = new boolean[26];
        int prev = 0;
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            int now = s.charAt(i);

            // 앞의 문자와 현재 문자가 같지 않다면
            if (prev != now) {
                // 해당 문자가 처음 나오는 경우
                if (check[now - 'a'] == false) {
                    check[now - 'a'] = true;    // false로 초기화되어있는 값을 true로 바꿔줌
                    prev = now; // 현재 문자를 prev로 변경(다음 문자 비교를 위해)
                }

                // 해당 문자가 나온 적이 있다면
                else {
                    return false;   // 함수 종료
                }
            }

            // 앞의 문자와 현재 문자가 같다면 (연속된 경우)
            continue;
        }
        return true;
    }
}
