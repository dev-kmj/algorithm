import java.util.*;

class 잘라서배열로저장하기 {
    public String[] solution(String my_str, int n) {

        List<String> answer = new ArrayList<>();
        
        // 문자열 길이가 n으로 나눠떨어지는 경우 
        for(int i = 0; i < (my_str.length() / n); i++) {
            answer.add(my_str.substring((n * i), (n * (i + 1))));
        }
        
        // 문자열 길이가 n으로 나눠떨어지지 않는 경우
        if(my_str.length() % n != 0) {
            answer.add(my_str.substring((my_str.length() / n) * n));
        }
        
        return answer.toArray(new String[0]);
    }
}
