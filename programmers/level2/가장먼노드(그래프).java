import java.util.*;
class 가장먼노드(그래프) {
    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public int solution(int n, int[][] edge) {
        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        
        for(int[] x : edge) {
            graph.get(x[0]).add(x[1]);
            graph.get(x[1]).add(x[0]);
        }
        
        boolean[] visited = new boolean[n+1];
        int answer = bfs(graph, n, visited);
        return answer;
    }
    
    public static int bfs(ArrayList<ArrayList<Integer>> graph, int n, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        int answer = 0;
        int[] depth = new int[n+1];
        queue.add(1);
        visited[1] = true;
        depth[1] = 1;
        
        while(!queue.isEmpty()) {
            int x = queue.poll();
            for(int i = 0; i < graph.get(x).size(); i++) {
                int next = graph.get(x).get(i);
                if(!visited[next]) {
                    visited[next] = true;
                    depth[next] += depth[x] + 1;
                    queue.add(next);
                }
            }
        }
        
        int max = Arrays.stream(depth).max().getAsInt();
        
        for(int i : depth) {
            if(i == max) answer++;
        }
        return answer;
    }
    
}
