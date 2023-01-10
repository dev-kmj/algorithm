import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int n, m, k, answer, tmp;
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
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && map[i][j])  {
                    tmp = 0;
                    dfs(i, j);
                    answer = Math.max(answer, tmp);
                }
            }
        }
        System.out.println(answer);
    }

    private static void dfs(int x, int y) {
        tmp++;
        visited[x][y] = true;
        for (int k = 0; k < 4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];

            if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
            if (!visited[nx][ny] && map[nx][ny]) {
                dfs(nx, ny);
            }
        }
    }
}
