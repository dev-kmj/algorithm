import java.util.*;
class 롤케이크자르기 {
    public int solution(int[] topping) {
        int answer = 0; 
        
        Map<Integer, Integer> mapA = new HashMap<>(); // 형  
        Map<Integer, Integer> mapB = new HashMap<>(); // 동생
        
        for(int t : topping) {
            mapB.put(t,  mapB.getOrDefault(t, 0) + 1);
        }
        
        for(int  t : topping) {
            mapA.put(t, mapA.getOrDefault(t, 0) + 1);
            
            if(mapB.get(t) - 1 == 0) {
                mapB.remove(t);
            } else {
                mapB.put(t, mapB.get(t) - 1);
            }
            
            if(mapA.size() == mapB.size()) answer++;
        }
        
        return answer;
    }
}
