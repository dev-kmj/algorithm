class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int n = total / num;
        int m = num / 2;
        int start = 0;
        
        if(num % 2 == 0) {
            start = n - m + 1;
        } else {
            start = n - m;
        }
        
        for(int i = 0; i < num; i++) {
            answer[i] = start;
            start++;
        }
        
        return answer;
    }
}
