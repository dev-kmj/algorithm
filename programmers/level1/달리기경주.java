import java.util.*;
class 달리기경주 {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for(String player : callings) {
            // 해설진이 선수 부름 (등수 호출)
            int callRank = map.get(player);
            // 앞에 있는 선수 호출 
            String ahead = players[callRank - 1];
            
            // players 배열 값 갱신 
            players[callRank - 1] = player;
            players[callRank] = ahead;
            
            // map(등수 정보) 갱신 
            map.put(player, callRank - 1);
            map.put(ahead, callRank);
        }
        
        return players;
    }
}
