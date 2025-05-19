import java.util.*;

class 개인정보수집유효기간 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        
        int todayTotal = toDays(today);
        
        // 약관 정보 저장 
        Map<String, Integer> termsMap = new HashMap<>();
        for (String term : terms) {
            String[] split = term.split(" ");
            termsMap.put(split[0], Integer.parseInt(split[1]));
        }
        
        // 개인정보 하나씩 검사 
        for (int i = 0; i < privacies.length; i++) {
            String[] split = privacies[i].split(" ");
            String date = split[0];
            String type = split[1];
            
            int collectedDate = toDays(date);
            int expiredDate = collectedDate + termsMap.get(type) * 28;
            
            if (expiredDate <= todayTotal) {
                answer.add(i + 1);
            }   
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    // 날짜를 일수로 변환
    private int toDays(String date) {
        String[] dateparts = date.split("\\.");
        int year = Integer.parseInt(dateparts[0]);
        int month = Integer.parseInt(dateparts[1]);
        int day = Integer.parseInt(dateparts[2]);
        
        return (year * 12 * 28) + (month * 28) + day;
    }
}
