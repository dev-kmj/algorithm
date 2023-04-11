class 푸드파이트대회 {
    public String solution(int[] food) {
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < food.length; i++) {
            int player = food[i] / 2;
            
            for(int j = 0; j < player; j++) {
                sb.append(i);
            }
        }
        
        String answer = sb.toString() + "0" + sb.reverse().toString();
        return answer;
        
    }
}
