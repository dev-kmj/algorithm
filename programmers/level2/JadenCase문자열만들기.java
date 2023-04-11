
class JadenCase문자열만들기 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.toLowerCase().split("");
        boolean flag = true;
        
        for(String ss : str) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;   // 공백일 경우 플래그를 달아서 대문자 변환 
        }
        
        return answer
    }
}
