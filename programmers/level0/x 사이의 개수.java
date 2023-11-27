class x사이의개수 {
    public int[] solution(String myString) {
        String[] stringArr = myString.split("x", myString.length());
        int[] answer = new int[stringArr.length];
        
        for (int i = 0; i < stringArr.length; i++) {
            answer[i] = stringArr[i].length();
        }
        return answer;
    }
}
