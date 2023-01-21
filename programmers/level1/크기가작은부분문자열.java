class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int len = p.length();   // p의 길이만큼 잘라야 함 
        long num = Long.parseLong(p);
        
        for(int i = 0; i < t.length() - len + 1; i++) {
            long value = Long.parseLong(t.substring(i, i + len));
            if(value <= num) answer++;
        }
        
        return answer;
    }
}
