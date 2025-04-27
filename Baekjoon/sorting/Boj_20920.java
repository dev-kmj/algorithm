import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Boj_20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 단어, 빈도수 카운트를 위한 해시맵
        Map<String, Integer> wordCount = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            // M 길이 이상인 단어만 처리
            if (word.length() >= M) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        List<String> words = new ArrayList<>(wordCount.keySet());

        words.sort((o1, o2) -> {
            // 1. 빈도수 비교 (내림차순)
            int freqComp = Integer.compare(wordCount.get(o2), wordCount.get(o1));
            if (freqComp != 0) return freqComp;

            // 2. 길이 비교 (내림차순)
            int lengthComp = Integer.compare(o2.length(), o1.length());
            if (lengthComp != 0) return lengthComp;

            // 3. 사전순 비교 (오름차순)
            return o1.compareTo(o2);
        });

        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append('\n');
        }

        System.out.print(sb);
    }
}
