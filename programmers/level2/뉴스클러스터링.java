import java.util.*;

class 뉴스클러스터링 {
    public int solution(String str1, String str2) {
        
        Map<String, Integer> multiset1 = createMultiset(str1.toLowerCase());
        Map<String, Integer> multiset2 = createMultiset(str2.toLowerCase());
        
        // 교집합, 합집합 
        int intersection = 0;
        int union = 0;
        
        Set<String> allKeys = new HashSet<>();
        allKeys.addAll(multiset1.keySet());
        allKeys.addAll(multiset2.keySet());
        
        for (String key : allKeys) {
            int count1 = multiset1.getOrDefault(key, 0);
            int count2 = multiset2.getOrDefault(key, 0);
            
            intersection += Math.min(count1, count2);
            union += Math.max(count1, count2);
        }
        
        if (union == 0) return 65536;
        
        double similarity = (double) intersection / union;
        return (int) (similarity * 65536);
    }
    
    private Map<String, Integer> createMultiset(String str) {
        Map<String, Integer> multiset = new HashMap<>();
        
        // 인접한 두 글자를 묶기 
        for (int i = 0; i < str.length() - 1; i++) {
            char a = str.charAt(i);
            char b = str.charAt(i + 1);
            
            // 두 글자 모두 알파벳인지 확인 
            if (Character.isLetter(a) && Character.isLetter(b)) {
                String pair = "" + a + b;
                multiset.put(pair, multiset.getOrDefault(pair, 0) + 1);
            }
        }
        
        return multiset;
    }
}
