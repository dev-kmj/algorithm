import java.util.*;
class 숫자변환하기 {
    public int solution(int x, int y, int n) {
        
        // x와 y가 같으면 연산할 필요가 없음 
        if (x == y) {
            return 0;
        }
        
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[1_000_001];
        
        queue.offer(new int[]{x, 0});
        visited[x] = true;
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentValue = current[0];
            int operations = current[1];
            
            // 가능한 3가지 연산 수행 
            int[] nextValues = {
                currentValue + n,
                currentValue * 2,
                currentValue * 3,
            };           
            
            for (int nextValue : nextValues) {
                // 목표값에 도달하면 연산횟수 반환 
                if (nextValue == y) {
                    return operations + 1; // 현재 상태에서 한 번의 연산을 더 수행해서 목표에 도달했기 때문 
                }
                
                if (nextValue <= y && !visited[nextValue]) {
                    visited[nextValue] = true;
                    queue.offer(new int[]{nextValue, operations + 1});
                }
            }
        }
        
        // 큐가 비었는데도 y로 만들지 못한 경우 
        return -1;
    }
}
