class 문자열압축 {
    public int solution(String s) {
        int answer = s.length(); //최대 길이로 초기화

        // 1부터 문자열 길이의 절반까지 단위를 증가시키며 압축 
        for (int i = 1; i <= s.length() / 2; i++) {
            StringBuilder compressed = new StringBuilder();
            String prev = s.substring(0, i);
            int count = 1;

            for (int j = i; j < s.length(); j += i) {
                String current = s.substring(j, Math.min(j + i, s.length()));

                if (prev.equals(current)) {
                    count++;
                } else {
                    if (count > 1) {
                        compressed.append(count);
                    }
                    compressed.append(prev);
                    prev = current;
                    count = 1;
                }
            }

            if (count > 1) {
                compressed.append(count);
            }
            compressed.append(prev);

            answer = Math.min(answer, compressed.length());
        }

        return answer;
    }
}
