import java.util.*;

class 문자열내마음대로정렬하기 {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        
        Collections.sort(list);
        
        answer = new String[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            // substring(1) : 인덱스 1부터 마지막 문자열까지를 잘라서 return 
            answer[i] = list.get(i).substring(1);
        }
        
        return answer;
    }
}
