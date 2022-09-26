class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int carpet = brown + yellow;
        
        // 행과 열은 최소 3 이상 
        for(int i = 3; i <= carpet; i++) {
            int col = i;    // 열
            int row = carpet / col; // 행
            
            if(row < 3) {
                continue;
            }
            
            if(row >= col) {
                if((row - 2) * (col -2) == yellow) {
                    answer[0] = row;
                    answer[1] = col;
                    return answer;
                }
            }
        }
        return answer;
    }
}
