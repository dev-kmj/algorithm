class 바탕화면정리 {
    public int[] solution(String[] wallpaper) {
        
        int lux = 51;   // 시작점은 50보다 클 수 없음 
        int luy = 51;
        int rdx = 0;    // 끝점은 1보다 작을 수 없음 
        int rdy = 0;   
        
        for(int i = 0; i < wallpaper.length; i++) {
            String point = wallpaper[i];
            for(int j = 0; j < wallpaper[i].length(); j++) {
                if(point.charAt(j) == '#') {
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);
                    rdx = Math.max(rdx, i + 1);
                    rdy = Math.max(rdy, j + 1);
                }   
            }
        }
        return new int[]{lux, luy, rdx, rdy};
    }
}
