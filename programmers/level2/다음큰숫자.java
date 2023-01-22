class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toBinaryString(n);
        int cnt = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') cnt++;
        }
        
        for(int i = n+1; i < 1000000; i++) {
            String tmp = Integer.toBinaryString(i);
            int tmpCnt = 0;
            for(int j = 0; j < tmp.length(); j++) {
                if(tmp.charAt(j) == '1') tmpCnt++;
            }
            
            if(tmpCnt == cnt) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
