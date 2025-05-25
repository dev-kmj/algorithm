import java.io.*;
import java.util.Scanner;

public class Boj_9372 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();   // 국가의 수
            int M = sc.nextInt();   // 비행기의 수

            // 간선 정보 (입력만 받고 저장은 하지 않음, 버퍼 비우기 위해 필요) 
            for (int i = 0; i < M; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
            }
            System.out.println(N-1);
        }
    }
}
