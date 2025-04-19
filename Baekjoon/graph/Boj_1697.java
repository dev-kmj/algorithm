import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Boj_1697 {

    static final int MAX = 100001;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(bfs(n, k));

    }

    // bfs 사용해서 최단시간 구하기 
    public static int bfs(int start, int target) {
        if (start == target) {
            return 0;
        }

        Queue<Integer> queue = new ArrayDeque<>();
        int[] time = new int[MAX];
        boolean[] visited = new boolean[MAX];

        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            // 이동 방법 3가지 
            int[] next = {current - 1, current + 1, current * 2};

            for (int i = 0; i < 3; i++) {
                if (next[i] < 0 || next[i] >= MAX) {
                    continue;
                }

                if (!visited[next[i]]) {
                    queue.offer(next[i]);
                    visited[next[i]] = true;
                    time[next[i]] = time[current] + 1;

                    if (next[i] == target) {
                        return time[next[i]];
                    }
                }
            }
        }
        return -1;  //도달할 수 없는 경우
    }
}
