class Solution {
    public int solution(String s) {
        char x = s.charAt(0);
        int xNum = 0;
        int diff = 0;
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(xNum == diff) {
                answer++;
                x = s.charAt(i);
            }
            if(s.charAt(i) == x) xNum++;
            else diff++;
        }
        return answer;
    }
}
