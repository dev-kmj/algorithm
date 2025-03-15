import java.io.*;
import java.util.*;

public class Boj_11725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 인접 리스트 생성
        List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }

        // 트리 연결 정보 입력
        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            tree.get(a).add(b);
            tree.get(b).add(a);
        }

        // 부모 노드를 저장할 배열
        int[] parents = new int[n + 1];

        // BFS로 트리 탐색
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];

        queue.offer(1);  // 루트 노드 시작
        visited[1] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            // 현재 노드와 연결된 모든 노드 확인
            for (int next : tree.get(current)) {
                if (!visited[next]) {
                    visited[next] = true;
                    parents[next] = current;  // 부모 노드 저장
                    queue.offer(next);
                }
            }
        }

        // 2번 노드부터 n번 노드까지의 부모 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            sb.append(parents[i]).append('\n');
        }
        System.out.println(sb);
    }
}
