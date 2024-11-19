import java.util.ArrayList;
import java.util.HashMap;

class 오픈채팅방 {
    public String[] solution(String[] record) {
        // Enter/Leave 메시지를 저장할 해시맵 생성 
        HashMap<String, String> message = new HashMap<>();
        message.put("Enter", "님이 들어왔습니다.");
        message.put("Leave", "님이 나갔습니다.");
        
        HashMap<String, String> uid = new HashMap<>();
        
        //record를 하나씩 처리 
        for(String s : record) {
            String[] info = s.split(" ");
            if (info.length == 3) {
                uid.put(info[1], info[2]);
            }
        }
        
        ArrayList<String> answer = new ArrayList<>();
        
        for(String s : record) {
            String[] info = s.split(" ");
            if(message.containsKey(info[0])) {
                answer.add(uid.get(info[1]) + message.get(info[0]));
            }
        }
    
        return answer.toArray(new String[0]);
    }
}
