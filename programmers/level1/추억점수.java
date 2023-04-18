import java.util.*;
class 추억점수 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        int[] answer = new int[photo.length];
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        for(int i = 0; i < photo.length; i++) {
            String[] people = photo[i]; // 그룹별 배열 생성 
            int score = 0;
            
            for(int j = 0; j < people.length; j++) {
                String person = people[j];
                if(map.containsKey(person)) {
                    score += map.get(person);
                }
            }
            answer[i] = score;
        }
        return answer;
    }
}
