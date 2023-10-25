class 치킨쿠폰 {
    public int solution(int chicken) {
        int answer = 0;

        while (chicken >= 10) {
            int newChicken = chicken / 10;
            int leftChicken = chicken % 10;
            chicken = newChicken + leftChicken;

            answer += newChicken;
        }

        return answer;
    }
}
