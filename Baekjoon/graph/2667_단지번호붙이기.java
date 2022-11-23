import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] map;
    static boolean[][] visited;
    static int n, count;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Integer> answerList = new ArrayList<>();

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(String.valueOf(input.charAt(j)));
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    count = 1;
                    answerList.add(dfs(i, j));
                }
            }
        }
        // 단지 내 집의 수를 오름차순으로 정렬 
        Collections.sort(answerList);

        sb.append(answerList.size()).append("\n");
        for (Integer i : answerList) {
            sb.append(i).append("\n");
        }

        System.out.println(sb.toString());
    }


    public static int dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX >= 0 && nextY >= 0 && nextX < n && nextY < n) {
                if (!visited[nextX][nextY] && map[nextX][nextY] == 1) {
                    dfs(nextX, nextY);
                    count += 1;
                }
            }
        }
        return count;
    }
}
