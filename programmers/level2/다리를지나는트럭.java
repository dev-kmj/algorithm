import java.util.*;

class 다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> q = new LinkedList<>();
        int sum = 0;
        
        for(int truck : truck_weights) {
            
            while(true) {
                //큐가 비어있으면 다음 트럭 삽입 
                if(q.isEmpty()) {
                    q.offer(truck);
                    sum += truck;
                    answer++;
                    break;
                }
                
                //다리에 트럭이 꽉 찬 경우(버틸 수 있는 무게만큼) 
                else if(q.size() == bridge_length) {
                    sum -= q.poll();
                } 
                else {
                    //다리에 트럭 올라갈 수 있는 경우 
                    if(sum + truck <= weight) {
                        q.add(truck);
                        sum += truck;
                        answer++;
                        break;
                    } else {
                        //다리에 트럭 무게 초과인 경우 
                        q.add(0);   //임의로 0을 넣어서 채워줌 
                        answer++;
                    }
                }
            }
        }
        answer += bridge_length;
        return answer;
    }
}
