import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Boj_22233 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<String> keyword = new HashSet<>();
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            keyword.add(word);
        }
        
        for (int i = 0; i < m; i++) {
            String[] words = br.readLine().split(",");
            for (String word : words) {
                keyword.remove(word);
            }
            System.out.println(keyword.size());
        }
    }
}
