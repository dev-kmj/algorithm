import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;


public class Boj_14226 {

    static final int MAX = 10000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());

        // BFS 를 위한 큐
        Queue<State> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[MAX+1][MAX+1]; // 화면, 클립보드

        queue.offer(new State(1, 0, 0));
        visited[1][0] = true; // 화면1, 클립보드0 에 이미 방문했다는 표시 -> 큐에 또 넣어 중복탐색 하는 걸 방지

        while (!queue.isEmpty()) {
            State current = queue.poll();

            if (current.screen == S) {
                System.out.println(current.time);
                return;
            }

            // 1. 복사
            if (!visited[current.screen][current.screen]) {
                queue.offer(new State(current.screen, current.screen,current.time + 1));
                visited[current.screen][current.screen] = true;
            }

            // 2. 붙여넣기 (클립보드 -> 화면)
            int nextScreen = current.screen + current.clipboard;
            if (current.clipboard > 0 && nextScreen <= MAX && !visited[nextScreen][current.clipboard]) {
                queue.offer(new State(nextScreen, current.clipboard, current.time + 1));
                visited[nextScreen][current.clipboard] = true;
            }

            // 3. 삭제 (화면 -1)
            if (current.screen > 0 && !visited[current.screen - 1][current.clipboard]) {
                queue.offer(new State(current.screen - 1, current.clipboard, current.time + 1));
                visited[current.screen - 1][current.clipboard] = true;
            }
        }

    }

    static class State {
        int screen;
        int clipboard;
        int time;

        State(int screen, int clipboard, int time) {
            this.screen = screen;
            this.clipboard = clipboard;
            this.time = time;
        }

    }
}
