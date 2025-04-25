import java.util.PriorityQueue;

class 더맵게 {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int s : scoville) {
            minHeap.offer(s); // 모든 스코빌 지수를 힙에 추가 
        }
    
        int mixCount = 0;
        
        // 가장 작은 스코빌 지수가 k보다 작고, 힙에 원소가 2개 이상 있을 때 반복
        while (minHeap.peek() < K && minHeap.size() >= 2) {
            int first = minHeap.poll();
            int second = minHeap.poll();
            
            int newScoville = first + (second * 2);
            minHeap.offer(newScoville);
            
            mixCount++;
        }
        
        if (minHeap.peek() < K) {
            return -1;
        }
        
        return mixCount;
        
    }
}
