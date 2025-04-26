import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Boj_1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            System.out.println(0);
            return;
        }

        int dasom = Integer.parseInt(br.readLine());

        //다른 후보들의 득표수
        PriorityQueue<Integer> others = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N - 1; i++) {
            others.add(Integer.parseInt(br.readLine()));
        }

        // 매수해야 하는 사람 수
        int count = 0;

        // 다솜이가 당선될 때까지 반복
        while (!others.isEmpty() && dasom <= others.peek()) {
            int maxVotes = others.poll();
            maxVotes--;
            dasom++;
            count++;

            others.add(maxVotes);
        }

        System.out.println(count);

    }
}
