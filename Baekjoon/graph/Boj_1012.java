import java.io.*;

public class Boj_1012 {
    static int row, col;
    static int [][] field;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};


    static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < row && ny < col) {
                if (!visited[nx][ny] && field[nx][ny] == 1) {
                    dfs(nx, ny);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            row = Integer.parseInt(input[0]); // 배추밭 가로
            col = Integer.parseInt(input[1]); // 배추밭 세로
            int plant = Integer.parseInt(input[2]); // 배추가 심어진 위치 개수

            field = new int[row][col];
            visited = new boolean[row][col];

            for (int j = 0; j < plant; j++) {
                String[] loc = br.readLine().split(" ");
                int p1 = Integer.parseInt(loc[0]);
                int p2 = Integer.parseInt(loc[1]);
                field[p1][p2] = 1;
            }

            int count = 0;
            for (int x = 0; x < row; x++) {
                for (int y = 0; y < col; y++) {
                    if (field[x][y] == 1 && !visited[x][y]) {
                        dfs(x, y);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}

