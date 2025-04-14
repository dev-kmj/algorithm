import java.util.*;

class 프로세스 {
    public int solution(int[] priorities, int location) {
        Deque<Document> queue = new ArrayDeque<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        // 큐 초기화 : 문서의 우선순위와 인덱스 저장 
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new Document(i, priorities[i]));
            priorityQueue.offer(priorities[i]); 
        }

        int printOrder = 0;

        while (!queue.isEmpty()) {
            Document current = queue.poll();

            // 현재 문서의 우선순위가 가장 높은지 판단 
            if (current.priority == priorityQueue.peek()) {
                printOrder++;
                priorityQueue.poll();

                if (current.index == location) {
                    return printOrder; 
                }
            } else {
                queue.offer(current);
            }
        }

        return -1; 
    }

    
    static class Document {
        int index;
        int priority;

        Document(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }
}
