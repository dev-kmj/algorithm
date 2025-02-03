import java.util.*;

public class 괄호회전하기 {
    static public int solution(String s) {
    
        int answer = 0;
        int n = s.length();
        Deque<Character> deque = new ArrayDeque<>();
        
        for(int i = 0; i < n; i++) {
            //문자열 회전 
            String rotated = s.substring(i) + s.substring(0, i);
            
            //올바른 괄호 문자열인지 확인 
            deque.clear(); //회전할때마다 deque 초기화
            boolean isValid = true; 
            
            for (char c : rotated.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    deque.push(c);
                } else {
                    if (deque.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    char top = deque.pop();
                    if ((c == ')' && top != '(') ||
                        (c == '{' && top != '{') ||
                        (c == '[' && top != '[')) {
                        isValid = false;
                        break;
                    }
                }
            }
            
            //스택이 비어있으면 올바른 괄호 문자열 
            if (isValid && deque.isEmpty()) {
                answer++;
            }
        }
        
        return answer;
    }
} 
