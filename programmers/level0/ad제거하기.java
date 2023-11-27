import java.util.*;

class ad제거하기 {
    public List solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        for(int i = 0; i<strArr.length; i++){
            if(!strArr[i].contains("ad")){
                answer.add(strArr[i]);
            }
        }
        return answer;
    }
}
