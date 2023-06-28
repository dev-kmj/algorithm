class 덧칠하기 {
    public int solution(int n, int m, int[] section) {
        int answer = 0; // 페인트를 칠해야 하는 최소 횟수 
        int maxSection = 0;
        
        for(int point : section) {
            if(maxSection <= point) {
                maxSection = point + m;  // 칠해야 하는 섹션 중 가장 큰 섹션과 포인트(기준)을 비교하면서 최소 횟수 구하기 
                answer++;
            }
        }
        return answer;
    }
}
