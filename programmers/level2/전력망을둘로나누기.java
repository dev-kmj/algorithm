import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int[][] arr;
    
    public int solution(int n, int[][] wires) {
        int answer = n;
        arr = new int[n+1][n+1];
        
        // 인접행렬에 넣기 
        for(int i = 0; i < wires.length; i++) {
            arr[wires[i][0]][wires[i][1]] = 1;
            arr[wires[i][1]][wires[i][0]] = 1;
        }
        
        // 선을 하나씩 끊으면서 순회 
        int a, b;
        for(int i = 0; i < wires.length; i++) {
            a = wires[i][0];
            b = wires[i][1];
            
            // 선을 하나 끊고
            arr[a][b] = 0;
            arr[b][a] = 0;
            
            // bfs
            answer = Math.min(answer, bfs(n, a));   // 최소값으로 answer 갱신 
            
            // 선 다시 복구 
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        
        return answer;
    }
    
    public int bfs(int n, int start) {
        int[] visit = new int[n+1];
        int cnt = 1;
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        
        while(!queue.isEmpty()) {
            int point = queue.poll();
            visit[point] = 1;
            
            // point와 연결된 것 중에 방문한 적 없는 노드 전부 큐에 넣기 
            for(int i = 1; i <= n; i++) {
                if(visit[i] == 1) {
                    continue;
                }
                if(arr[point][i] == 1) {
                    queue.offer(i);
                    cnt++;
                }
            }
        }
        return (int)Math.abs(n- 2*cnt); // n - (n - cnt) 
    }
}
