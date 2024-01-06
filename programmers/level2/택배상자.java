import java.util.Stack;

class 택배상자 {
    public int solution(int[] order) {
        int answer = 0;
    
        Stack<Integer> sub = new Stack<>();
        int box = 1; 
        
        for(int o : order) {
            while(box <= order.length) {
                if(box == o) {
                    break;
                } else if(!sub.isEmpty() && sub.peek() == o) {  //보조 컨베이어벨트에 순서에 맞는 상자가 있다면 
                    break;
                } else {    //둘 다 없다면 
                    sub.push(box);  //보조 컨베이어벨트에 올리기 
                    box++;  //1 증가시켜 다음 메인 컨베이어 벨트 상자로
                }
            }
            
            //스택에 저장하고 탐색 시작 
            if(box == o) { //메인 컨베이어벨트 위에 순서에 맞는 상자가 있다면 
                box++;  //하나 꺼내고
                answer++;   //정답 증가 
            } else if(!sub.isEmpty() && sub.peek() == o) {
                sub.pop();  //보조 컨베이어벨트에서 하나 꺼내고 
                answer++;
            } else {    //둘 다 없다면 더 이상 실을 게 없으니 종료 
                break;
            }
        }
        return answer;
    }
}
