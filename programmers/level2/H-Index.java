import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        // 인용횟수 오름차순 정렬 
        Arrays.sort(citations);
        
        // 인용횟수 배열 요소를 차례로 h로 지정하며 조건에 맞는지 확인 
        for(int i = 0; i < citations.length; i++) {
            // 해당 논문보다 인용횟수가 크거나 같은 논문 개수 
            int h = citations.length - i;   
            
            // 조건을 처음으로 만족하는 순간이 h-index (이후는 체크할 필요 없음)
            if(citations[i] >= h) {
                answer = h;
                break;
            }
        }
        return answer;
    }
}
