import java.util.*;

class 대충만든자판 {
    public int[] solution(String[] keymap, String[] targets) {
        
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> key = new HashMap<>();
        
        for(int i = 0; i < keymap.length; i++) {
            for(int j = 0; j < keymap[i].length(); j++) {
                char cur = keymap[i].charAt(j);
                if(key.containsKey(cur)) {
                    int idx = key.get(cur);
                    key.put(cur, Math.min(idx, j+1));
                } else {
                    key.put(cur, j+1);
                }
            }
        }
        
        for(int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int count = 0;
            boolean write = true;
            for(char cur : target.toCharArray()) {
                if(key.containsKey(cur)) {
                    count += key.get(cur);
                } else {
                    write = false;
                    break;
                }
            }
            answer[i] = write == false ? -1 : count;
        }
        return answer;
    }
}
