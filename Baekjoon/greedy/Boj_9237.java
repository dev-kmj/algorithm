import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Boj_9237 {

    static int n;
    static Integer[] t;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = new Integer[n];
        
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        
        //오래걸리는 것부터 심어야하므로 역순으로 정렬 
        Arrays.sort(t, Collections.reverseOrder());
        int max = 0;
        for (int i = 0; i < n; i++) {
            //심는기간 1일 + 자라는 기간 + 지난일수 
            max = Math.max(max, 1 + t[i] + i);
        }
        
        //다 심고 다음날 초대 가능
        max += 1;
        System.out.println(max);
    }
}
