import java.util.*;

class 조이스틱 {
    public int solution(String name) {
        int answer = 0;
        int index;
        int move = name.length()-1;
        
        for(int i=0;i<name.length();i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);
            
            index = i+1;
            while(index<name.length() && name.charAt(index) == 'A') {
                index++;
            }
            move = Math.min(move, i * 2 + name.length() - index);   //i*2 : 현재 인덱스에서 다시 뒤로 돌아감 
            move = Math.min(move, (name.length() - index) * 2 + i);  //처음부터 뒷부분을 먼저 입력하는 게 빠른 경우
        }
        return answer + move;
    }
}
