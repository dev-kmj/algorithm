class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int win = 0;
        
        for(int i : lottos) {
            if(i == 0) zero++;
            else {
                for(int j : win_nums) {
                    if(i == j) {
                        win++;
                        break;
                    }
                }
            }
        }
        
        int min = win;
        int max = min + zero;
        
        int[] answer = {Math.min(7 - max, 6), Math.min(7 - min, 6)};
        return answer;
        
    }
}
