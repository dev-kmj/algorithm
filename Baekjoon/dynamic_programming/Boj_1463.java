import java.util.Scanner;

class Boj_1463 {
    public static int[] d = new int[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        // 다이나믹 프로그래밍 진행 (bottom - up)
        for (int i = 2; i <= x; i++) {
            // 현재의 수에서 1을 빼는 경우
            d[i] = d[i - 1] + 1;

            if (i % 3 == 0) {
                d[i] = Math.min(d[i], d[i / 3] + 1);
            }
            if (i % 2 == 0) {
                d[i] = Math.min(d[i], d[i/ 2] + 1);
            }
        }
        System.out.println(d[x]);
    }
}
