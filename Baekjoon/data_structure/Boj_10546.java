import java.util.*;
public class Boj_10546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            String str=sc.next();
            map.put(str, map.getOrDefault(str, 0)+1);
        }

        for(int i=0; i<n-1; i++){
            String str = sc.next();
            if(map.containsKey(str)) map.put(str, map.get(str)-1);
            if(map.get(str)==0) map.remove(str);
        }
        for(String key : map.keySet()){
            System.out.println(key);
        }
    }
}
