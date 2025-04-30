class 유연근무제 {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = schedules.length; // 전체 직원수로 시작
        
        // 각 직원별로 출근 기록 확인 
        for (int i = 0; i < schedules.length; i++) {
            for (int j = 0; j < 7; j++) {
                // 현재 날짜 요일 계산 
                int dayOfweek = (startday - 1 + j) % 7 + 1;
                
                if (isWeekday(dayOfweek) && 
                   toMinutes(timelogs[i][j]) > toMinutes(schedules[i]) + 10) {
                    answer--; // 자격 안 되는 카운트 감소
                    break; // 다음 직원 확인 
                }
            }
        }
        
        return answer;
    }
    
    // 평일인지 확인 
    private boolean isWeekday(int dayOfWeek) {
        return dayOfWeek >=1 && dayOfWeek <= 5;
    }

    private int toMinutes(int time) {
        return (time / 100) * 60 + (time % 100);
    } 
}
