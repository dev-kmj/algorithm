import java.util.*;

class 줄서는방법 {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        List<Integer> list = new ArrayList<>();
        
        long num = 1;
        int idx = 0;
        
        for(int i = 1; i <= n; i++) {
            list.add(i);
            num *= i;
        }
        k--;
        
        while(idx < n){
            num /= n - idx;
            answer[idx++] = list.remove((int) (k / num));
            k %= num;
        }
        return answer;
    }
}
