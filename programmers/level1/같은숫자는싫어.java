import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int tempNum = 10; 
        for(int num : arr) {
            if(tempNum != num) {
                tempList.add(num);
            }
            tempNum = num;
        }

        int[] answer = new int[tempList.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = tempList.get(i);
        }

        return answer;
    }
}
