import java.util.*;
class 뒤에있는큰수찾기 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = numbers.length - 1; i >= 0; i--) {
          // 스택이 비어있지 않고 맨 위의 원소가 현재 원소보다 작거나 같은 경우 맨 위의 원소를 제거 
            while (!stack.isEmpty() && stack.peek() <= numbers[i]) {
                stack.pop();
            }
            
            // 스택이 비어있는 경우는 뒤에 큰 수가 존재하지 않기 때문에 -1 대입 
            if (stack.isEmpty()) {
                answer[i] = -1;
            } else {
                answer[i] = stack.peek();     // 스택이 비어있지 않고 스택 맨 위의 원소가 더 큰 경우는 맨 위의 원소를 대입 
            }
            
            stack.push(numbers[i]);
        }
        return answer;
    }
}
