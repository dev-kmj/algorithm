import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj_3986 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();
            stack.push(s.charAt(0));

            for (int j = 1; j < s.length(); j++) {
                char cur = s.charAt(j);
                if (!stack.isEmpty()) {
                    char prev = stack.peek();
                    if (prev == cur) {
                        stack.pop();
                        continue;
                    }
                }
                stack.push(cur);
            }

            // 스택이 비어있다면 좋은 단어
            if (stack.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
