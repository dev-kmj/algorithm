import java.io.*;
import java.util.StringTokenizer;

public class Boj_2512 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] budgets = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        int maxBudget = 0;
        long totalRequest = 0;

        for (int i = 0; i < n; i++) {
            budgets[i] = Integer.parseInt(st.nextToken());
            maxBudget = Math.max(maxBudget, budgets[i]);
            totalRequest += budgets[i];
        }

        int totalBudget = Integer.parseInt(br.readLine());

        if (totalRequest <= totalBudget) {
            System.out.println(maxBudget);
            return;
        }

        int left = 0;
        int right = maxBudget;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long sum = 0;
            for (int budget : budgets) {
                sum += Math.min(budget, mid);
            }

            if (sum <= totalBudget) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(result);
    }
}
