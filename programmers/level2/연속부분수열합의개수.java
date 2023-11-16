import java.util.Set;
import java.util.HashSet;

class 연속부분수열합의개수 {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();

        for (int len = 1; len <= elements.length; len++) {
            for (int i = 0; i < elements.length; i++) {
                int sum = 0;
                for (int j = 0; j < len; j++) {
                    sum += elements[(i + j) % elements.length];  // 원형수열이기 때문에 배열의 길이를 넘어가면 다시 처음부터 시작하도록 한다.
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}
