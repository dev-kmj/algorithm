class Solution {
    public String solution(String s) {
        String answer = "";
        int num = s.length();
        int num2= num / 2;
        if(num % 2 == 0) {
            answer = s.substring(num2-1, num2+1);
        } else {
            answer = s.substring(num2, num2+1);
        }
        return answer;
    }
}


// 조건문을 쓰지 않는 풀이 
// return word.substring((word.length()-1) / 2, word.length()/2 + 1); 
