public class Boj_4673 {

    public static void main(String[] args) {

        boolean[] numbers = new boolean[10000]; // 셀프 넘버를 구분하기 위한 배열

        for (int i = 1; i < numbers.length; i++) {
            int n = d(i);
            if (n < 10001) {
                numbers[n - 1] = true;    // 셀프넘버가 아니면 true 대입
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == false) {
                System.out.println(i + 1);
            }
        }
    }

    static int d(int number) {
        int sum = number;

        while (number != 0) {
            sum += (number % 10);   // 일의 자리 수를 sum에 누적
            number /= 10;    // 자릿수 줄어듬
        }
        return sum;
    }
}
