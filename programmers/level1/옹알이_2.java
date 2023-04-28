class 옹알이_2 {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] arr = {"aya", "ye", "woo", "ma"};
        
        for(String b : babbling) {
            for(String a : arr) {
                if(!b.contains(a+a)) {
                    b = b.replace(a, " ");
                }
            }
            b = b.replace(" ", "");
            if(b.length() == 0) answer++;
        }
        
        return answer;
    }
}
