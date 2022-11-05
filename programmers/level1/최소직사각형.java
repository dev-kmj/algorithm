class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;

        // 가로는 긴거 세로는 짧은 거로 설정해주기 (하나에 몰아주기) 
        int max_w = 0; 
        int max_h = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            max_w = Math.max(max_w, v);
            max_h = Math.max(max_h, h);
        }
        answer = max_w * max_h;
        return answer;
    }
}
