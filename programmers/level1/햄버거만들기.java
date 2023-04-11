class 햄버거만들기 {
    public int solution(int[] ingredient) {
        int[] stack = new int[ingredient.length];
        int idx = 0;
        int answer = 0;
        
        for (int i : ingredient) {
            stack[idx++] = i;
            if (idx >= 4 
                && stack[idx - 1] == 1 
                && stack[idx - 2] == 3
                && stack[idx - 3] == 2
                && stack[idx - 4] == 1) {
                idx -= 4;
                answer++;
            }
        }
        return answer;
    }
}
