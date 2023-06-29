class 예상대진표 {
    public int solution(int n, int a, int b)
    {
        int answer = 0;

        
        // a와 b가 한 게임에 들어있을 때까지 반복 
        while(a != b) {
            a = (a / 2) + (a % 2);
            b = (b / 2) + (b % 2);
            
            answer++;
        }
        return answer;
    }
}
