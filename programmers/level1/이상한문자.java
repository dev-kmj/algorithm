import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        String[] array = s.split("");
        
        for(String ss : array) {
            idx = ss.contains(" ") ? 0 : idx + 1;
            answer += idx % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer; 
    }
}
