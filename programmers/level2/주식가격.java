import java.util.Stack;

class 주식가격 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();   // 스택을 이용한 O(n)순회 
        
        for(int i = 0; i < prices.length; i++) {
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                answer[stack.peek()] = i - stack.peek();   // 가격이 떨어졌다면 숫자 기록 
                stack.pop();    // 답을 구했기 때문에 스택에서 제거 
            }
            stack.push(i);
        }
        
        while(!stack.isEmpty()) { // 값을 구하지 못한 인덱스 (= 끝까지 가격이 떨어지지 않은 주식)
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }
        
        return answer;
    }
}
