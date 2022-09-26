import java.util.Arrays;

class Solution {
    public String solution(int n) {
        String answer = "";
        char[] charArray = new char[n];

        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) charArray[i] = '수';
            else charArray[i] = '박';
        }

        answer = String.valueOf(charArray);
        return answer;
    }
}
