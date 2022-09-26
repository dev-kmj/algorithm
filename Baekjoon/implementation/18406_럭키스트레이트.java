import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum = 0;

        // 왼쪽 부분의 자릿수 합
        for (int i = 0; i < str.length() / 2; i++) {
            sum += str.charAt(i) - '0';
        }

        // 오른쪽 부분 자릿수의 합 (비교를 위해 빼줌) 
        for (int i = str.length() / 2; i < str.length(); i++) {
            sum-= str.charAt(i) - '0';
        }

        // 왼쪽 부분과 오른쪽 부분의 자릿 수 합 동일한지 비교
        if (sum == 0) System.out.println("LUCKY");
        else System.out.println("READY");
    }

}
