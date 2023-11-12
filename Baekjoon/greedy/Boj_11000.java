import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_11000 {
    static class Class implements Comparable<Class> {
        int start;
        int end;

        public Class(int start, int end) {
            this.start = start;
            this.end = end;
        }

        // 시작시간이 같다면 종료시간으로 정렬 
        @Override
        public int compareTo(Class o) {
            if (this.start == o.start) {
                return this.end - o.end;
            } else {
                return this.start - o.start;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        List<Class> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list.add(new Class(start, end));
        }

        Collections.sort(list);
        Queue<Integer> q = new PriorityQueue<>();
        int endTime = 0;

        for (Class c : list) {
            endTime = c.end;

            if(!q.isEmpty() && q.peek() <= c.start) {
                q.poll();
            }
            q.add(endTime);
        }
        System.out.println(q.size());
    }
}
