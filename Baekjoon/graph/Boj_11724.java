import java.util.Scanner;

public class Boj_11724 {

    static int[][] node;
    static boolean[] visited;
    static int m, n;

    public static void dfs(int start) {
        visited[start] = true;

        for (int i = 0; i < n; i++) {
            if (node[start][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        node = new int[n][n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            node[a][b] = 1;
            node[b][a] = 1;
        }

        int count = 0;

        for (int i = 0; i <n; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }
    }
}
