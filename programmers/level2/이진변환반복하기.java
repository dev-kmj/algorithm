public class 이진변환반복하기 {
    public static int[] solution(String s) {
        int zeroCnt = 0, changeCnt = 0;
        
        while(!s.equals("1")) {
        	for(int i=0; i<s.length(); i++) {
        		char ch = s.charAt(i);
        		if(ch=='0') zeroCnt++;
        	}
        	int len = s.replaceAll("0", "").length();
        	s = Integer.toString(len,2);
        	changeCnt++;
        }
        int[] answer = new int[2];
        answer[0] = changeCnt;
        answer[1] = zeroCnt;
        
        return answer;
    }
}
