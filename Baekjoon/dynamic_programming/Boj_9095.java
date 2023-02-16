import java.util.*;

public class Boj_9095 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int[] nums = new int[11];   // n은 11보다 작은 양수
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 4;
        // nums[4] = nums[3] + nums[2] + nums[1] = 7
        for (int i = 0; i < tc; i++) {
            int n = sc.nextInt();
            for (int j = 4; j <= n; j++) {
                nums[j] = nums[j - 1] + nums[j - 2] + nums[j - 3];
            }
            System.out.println(nums[n]);
        }
    }
}
