import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        
        String[] strArr = s.split("");
        Map<String, Integer> map = new HashMap<String, Integer>();
        int[] answer = new int[strArr.length];
        
        for(int i = 0; i < strArr.length; i++) {
            if(map.get(strArr[i]) == null) {
                answer[i] = -1;
            } else {
                answer[i] = i - map.get(strArr[i]);
            }
            map.put(strArr[i], i);
        }
       
        return answer;
    }
}
