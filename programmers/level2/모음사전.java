import java.util.ArrayList;
import java.util.List;

class 모음사전 {
    static String[] arr;
    static List<String> list;
    public int solution(String word) {
        int answer = 0;
        
        list = new ArrayList<>();
        arr = new String[]{"A", "E", "I", "O", "U"};
        
        // 완전탐색 함수 호출  (dfs)
        dfs(word, "", 0);
        
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(word)) {
                answer = i;
                break;
            }
        }
        return answer;
    }
    
    static void dfs(String word, String str, int depth) {
        list.add(str);
        
        // 5글자
        if(depth == 5) {
            return;
        }

        for(int i = 0; i < arr.length; i++) {
            dfs(word, str + arr[i], depth + 1);
        }
    }
}
