import java.util.*;

class Solution {
    HashSet<Integer> set = new HashSet<>(); // 순열로 만든 조합 넣음
    
    public int solution(String numbers) {
        int answer = 0;
        permutation("", numbers);
        
        Iterator<Integer> it = set.iterator(); // 요소 순차 처리
        while(it.hasNext()){
            int a = it.next(); // 하나씩 읽어와
            if(prime(a)) answer++;
        }
         
        
        return answer;
    }
    public void permutation(String prefix, String str){ // 순열
        int n = str.length();
        if(!prefix.equals("")){
            set.add(Integer.valueOf(prefix));
        }
        for(int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
    }
    
    public boolean prime(int a){ // 소수인지 확인
    		if(a == 0 || a == 1) {
   			return false;
  		}
  		else {
    		for(int i = 2; i <= Math.sqrt(a); i++)
      			if(a % i == 0) return false;
  		}
  		return true;
    }
}
