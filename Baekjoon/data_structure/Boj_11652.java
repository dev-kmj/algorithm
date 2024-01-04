import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Boj_11652 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashMap<Long, Integer> map = new HashMap<>();

        int max = 0;
        long answer = 0;


        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(br.readLine());
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > max) {
                max = map.get(num);
                answer = num;
            } else if (map.get(num) == max) {
                answer = Math.min(answer, num);
            }
        }

        System.out.println(answer);
    }
}
