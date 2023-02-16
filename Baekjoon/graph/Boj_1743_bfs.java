import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_1743_bfs {

    static int n, m, k, answer, cnt;
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};
    static boolean[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        map = new boolean[n][m];
        visited = new boolean[n][m];

        for (int i =  0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            map[r-1][c-1] = true;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m;j++) {
                if (!visited[i][j] && map[i][j]) {
                    cnt = 0;
                    bfs(i, j);
                    answer = Math.max(answer, cnt);
                }
            }
        }
        System.out.println(answer);
    }

    private static void bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x, y));
        visited[x][y] = true;
        cnt++;
        while (!q.isEmpty()) {
            Point tmp = q.poll();
            for (int k = 0; k < 4; k++) {
                int nx = tmp.x + dx[k];
                int ny = tmp.y + dy[k];
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (!visited[nx][ny] && map[nx][ny]) {
                    q.add(new Point(nx, ny));
                    visited[nx][ny] = true;
                    cnt++;
                }
            }
        }
    }

    static class Point {
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
