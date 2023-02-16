import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Boj_20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] temp = br.readLine().split("\\.");
            if (map.containsKey(temp[1])) {
                int cnt = map.get(temp[1]);
                map.replace(temp[1], ++cnt);
            } else {
                map.put(temp[1], 1);
            }
        }

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
