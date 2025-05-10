import java.util.*;

class 두큐합같게만들기 {
    public int solution(int[] queue1, int[] queue2) {
        int n = queue1.length;
        int totalLen = n * 2; // 전체 길이 
        long[] arr = new long[totalLen];
        
        long sum1 = 0;
        long total = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = queue1[i];
            sum1 += arr[i];
        }
        
        for (int i = 0; i < n; i++) {
            arr[n + i] = queue2[i];
        }
        
        for (long num : arr) {
            total += num;
        }
        
        
        if (total % 2 != 0) return -1;
        
        long target = total / 2;
        
        // 투 포인터 초기값 설정 
        int left = 0;
        int right = n;
        int count = 0;
        int maxOperations = totalLen * 3;
        
        while (count <= maxOperations) {
            if (sum1 == target) return count;
            
            if (sum1 < target) {
                sum1 += arr[right % totalLen];
                right++;
            } else {
                sum1 -= arr[left % totalLen];
                left++;
            }
            count++;
        }
        return -1;
    }
}
