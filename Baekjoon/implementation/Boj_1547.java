import java.io.IOException;
import java.util.Scanner;

public class Boj_1547 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int s = sc.nextInt();   // 컵 위치 변경 횟수
        int cup = 1;    // 컵 번호 
        for (int i = 0; i < s; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if (cup == x) cup = y;
            else if (cup == y) cup = x;
        }

        System.out.println(cup);
    }
}
