import java.util.*;

class 할인행사 {
    static Map<String, Integer> wantMap;
    static Map<String, Integer> map;
    
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        wantMap = new HashMap<>();
        map = new HashMap<>();
        
        for(int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        
        for(int i = 0; i < 10; i++) {
            if(map.containsKey(discount[i])) {
                map.put(discount[i], map.get(discount[i]) + 1);
            } else {
                map.put(discount[i], 1);
            }
        }
        
        if(isSignUp()) answer++;
        if(discount.length == 10) return answer;
        
        for(int i = 10; i < discount.length; i++) {
            map.put(discount[i-10] , map.get(discount[i-10]) - 1);
            
            if(map.containsKey(discount[i])) {
                map.put(discount[i], map.get(discount[i]) + 1);
            } else {
                map.put(discount[i], 1);
            }
            
            if(isSignUp()) answer++;
        }
        
        return answer;
        
    }
    
    private boolean isSignUp() {
        for(String key : wantMap.keySet()) {
            if(map.get(key) != wantMap.get(key)) return false;
        }
        return true;
    }
}
