import java.util.*;

public class 점프와순간이동 {
    public int solution(int n) {
        int ans = 0;
        
        while(n > 1) {
            if(n % 2 == 1) {
                ans++;
            }
            n /= 2;
        }
        ans++;
        return ans;
    }
}
