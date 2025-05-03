import java.io.*;

public class Boj_9935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String bomb = br.readLine();
        int bombLen = bomb.length();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            sb.append(input.charAt(i));

            // 폭발 문자열과 비교
            if (sb.length() >= bombLen) {
                boolean isBomb = true;

                for (int j = 0; j < bombLen; j++) {
                    if (sb.charAt(sb.length() - bombLen + j) != bomb.charAt(j)) {
                        isBomb = false;
                        break;
                    }
                }
                
                if (isBomb) {
                    sb.delete(sb.length() - bombLen, sb.length());
                }
            }
        }
        
        System.out.println(sb.length() == 0 ? "FRULA" : sb.toString());
    }
}
