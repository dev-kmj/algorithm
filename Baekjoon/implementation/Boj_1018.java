import java.io.*;

public class Boj_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]); // 체스판 가로 크기
        int m = Integer.parseInt(input[1]); // 체스판 세로 크기

        char[][] board = new char[n][m];    // 체스판 배열

        // 체스판 입력받기
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int answer = Integer.MAX_VALUE;   // 최소 칠해야 하는 횟수 (int 자료형의 최대값으로 설정)


        // 모든 경우의 수를 계산하여 최소값 찾기
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                int countW = 0; // 첫 번째 칸이 W인 경우 칠해야 하는 횟수
                int countB = 0; // .. B인 경우..

                for (int x = i; x < i + 8; x++) {
                    for (int y = j; y < j + 8; y++) {
                        if ((x + y) % 2 == 0) {         // (x, y) 가 W인 경우
                            if (board[x][y] != 'W') {
                                countW++;
                            } else {
                                countB++;
                            }
                        } else {    // (x,y) 가 B인 경우
                            if (board[x][y] != 'B') {
                                countW++;
                            } else {
                                countB++;
                            }
                        }
                    }
                }

                // 최소값 업데이트
                int min = Math.min(countW, countB);
                answer = Math.min(answer, min);
            }
        }

        System.out.println(answer);
    }
}

