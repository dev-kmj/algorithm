class 키패드누르기 {
    public String solution(int[] numbers, String hand) {
    
        int[][] keypad = {
            {3, 1}, 
            {0, 0}, {0, 1}, {0, 2},
            {1, 0}, {1, 1}, {1, 2},
            {2, 0}, {2, 1}, {2, 2}
        };
        
        // 왼손과 오른손의 초기 위치 (*, #)
        int[] left = {3, 0};
        int[] right = {3, 2};
        
        StringBuilder answer = new StringBuilder();
        
        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer.append("L");
                left = keypad[number];
            } else if (number == 3 || number == 6 || number == 9) {
                answer.append("R");
                right = keypad[number];
            } else { // 2, 5, 8, 0은 거리 계산 필요
                int[] target = keypad[number];
                
                // 왼손과 오른손에서 목표 숫자버튼까지의 거리 계산 
                int leftDist = getDistance(left, target);
                int rightDist = getDistance(right, target);
                
                // 거리에 따라 손가락 선택
                if (leftDist < rightDist) {
                    answer.append("L");
                    left = target;
                } else if (rightDist < leftDist) {
                    answer.append("R");
                    right = target;
                } else {
                    // 거리가 같으면 주 손잡이에 따라 결정 
                    if (hand.equals("left")) {
                        answer.append("L");
                        left = target;
                    } else {
                        answer.append("R");
                        right = target;
                    }
                }
            }
        }
        
        return answer.toString();
    }
    
    private int getDistance(int[] from, int[] to) {
        return Math.abs(from[0] - to[0])+ Math.abs(from[1] - to[1]);
    }
}
