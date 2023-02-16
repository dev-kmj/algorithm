import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2941 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int len = s.length();
        int cnt = 0;

        for (int i = 0; i < len; i ++) {

            char ch = s.charAt(i);

            // 문제에 주어진 표를 보면서 조건식 작성 
            if (ch == 'c' && i < len - 1) {
                // c 다음 문자가 '=' 또는 '-'이라면?
                if (s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') {
                    // 두 문자를 하나로 취급하니까 다음 문자로 건너뛰기 위해 1 증가
                    i++;
                }
            }

            else if(ch == 'd' && i < len -1) {
                if (s.charAt(i + 1) == '-') {
                    // d-일 경우
                    i++;
                } else if(s.charAt(i + 1) == 'z' && i < len -2) {
                    if (s.charAt(i + 2) == '=') {
                        i += 2;
                    }
                }
            }

            else if((ch == 'l' || ch == 'n') && i < len -1) {
                if (s.charAt(i + 1) == 'j') {
                    i++;
                }
            }

            else if ((ch == 's' || ch == 'z') && i < len-1) {
                if (s.charAt(i + 1) == '=') {
                     // s= 또는 z=일 경우
                    i++;
                }
            }

            cnt++;
        }
        System.out.println(cnt);
    }
}
