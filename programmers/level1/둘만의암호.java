class 둘만의암호 {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        
        for(char letter : s.toCharArray()) {
            char temp = letter;
            int idx = 0;
            while(idx < index) {
                // temp = temp == 'z' ? 'a' : (char)(temp + 1);
                
                if(temp == 'z') {
                    temp = 'a';
                } else {
                    temp = (char)(temp + 1);
                }
                
                if(!skip.contains(String.valueOf(temp))) {
                    idx++;
                }
            }
            answer.append(temp);
        }
        return answer.toString();
    }
}
