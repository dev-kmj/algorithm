class 붕대감기 {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth = health;
        int castTime = bandage[0];
        int healPerSecond = bandage[1];
        int bonusHeal = bandage[2];
        
        int currentTime = 0;
        int combo = 0;
        
        for (int i = 0; i < attacks.length; i++) {
            int attackTime = attacks[i][0];
            int damage = attacks[i][1];
            
            // 다음 공격까지 남은 시간동안 회복 처리 
            int gap = attackTime - currentTime - 1;
            
            for (int t = 0; t < gap; t++) {
                combo++;
                health += healPerSecond;
                if (combo == castTime) {
                    health += bonusHeal;
                    combo = 0;
                }
                if (health > maxHealth) {
                    health = maxHealth;
                }
            }
            
            // 공격 시 체력 감소 
            health -= damage;
            if (health <= 0) {
                return -1;
            }
            
            // 상태 갱신 
            currentTime = attackTime;
            combo = 0; 
        }
        return health;
    }
}
