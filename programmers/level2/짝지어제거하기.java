import java.util.*;
class 짝지어제거하기 {
    public int solution(String s) {
        int answer = -1;
        
        Stack<Character> stack = new Stack<>();
        
        for(char ch : s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty() ? 1 : 0;
        
    }
}
