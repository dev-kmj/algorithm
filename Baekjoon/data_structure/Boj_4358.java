import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Boj_4358 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, Integer> map = new TreeMap<>();
        int cnt = 0;

        while (true) {
            String input = br.readLine();
            if (input == null || input.length() == 0) break;
            
            //이미 나온 적 있는 종일 경우 
            if (map.containsKey(input)) {
                map.put(input, map.get(input) + 1); 
            } else { //처음 등장하는 종일 경우 
                map.put(input, 1);
            }
            cnt++;
        }
        
        for (String key : map.keySet()) {
            double value = (double)map.get(key) / (double)cnt * 100;
            System.out.println(key + " " + String.format("%.4f", value));
        }
    }
}
