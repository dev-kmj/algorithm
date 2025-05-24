import java.io.*;
import java.util.StringTokenizer;

public class Boj_2563 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[][] canvas = new boolean[100][100];
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 색종이 크기는 10*10
            for (int dx = x; dx < x + 10; dx++) {
                for (int dy = y; dy < y + 10; dy++) {
                    canvas[dx][dy] = true;
                }
            }
        }

        // 넓이 계산
        int area = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (canvas[i][j]) {
                    area++;
                }
            }
        }

        System.out.println(area);
    }
}
