class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    
                    // 합이 소수인지 확인 
                    if(isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    
    private boolean isPrime(int num) {
        
        // 1은 나눌 필요가 없으므로 i=2부터 시작 
        for(int i = 2; i < num; i++) {
            if(num % i == 0) return false;
        }
        // 나누어 떨어지지 않으면 소수 
        return true;
    }
}
