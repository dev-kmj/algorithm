import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;


public class Boj_2493 {

    static class Tower {
        int index;
        int height;

        Tower(int index, int height) {
            this.index = index;
            this.height = height;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] result = new int[n];
        Stack<Tower> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 왼쪽에서 오른쪽으로 탑을 하나씩 처리
        for (int i = 0; i < n; i++) {
            int height = Integer.parseInt(st.nextToken());

            // 현재 탑보다 낮은 탑은 신호를 수신할 수 없으므로 제거
            while (!stack.isEmpty() && stack.peek().height < height) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                result[i] = stack.peek().index;
            } else {
                result[i] = 0;  // 수신 가능한 탑이 없음
            }

            // 현재 탑을 스택에 저장 (현재 탑이 이후 탑들 신호의 수신자가 될 수 있음)
            stack.push(new Tower(i + 1, height));
        }

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);
    }

}
