import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());  // 단어의 개수
        int M = Integer.parseInt(st.nextToken());  // 외울 단어의 길이 기준
        
        Map<String, Integer> wordCount = new HashMap<>();  // 단어와 그 빈도를 저장하는 맵
        
        // 단어 입력 및 빈도 계산
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            
            // 길이가 M 이상인 단어만 저장
            if (word.length() >= M) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        
        // 단어를 리스트로 변환
        List<String> words = new ArrayList<>(wordCount.keySet());
        
        // 정렬 조건: 자주 나온 순서 -> 길이 긴 순서 -> 알파벳 순
        words.sort((w1, w2) -> {
            int freqCompare = wordCount.get(w2).compareTo(wordCount.get(w1)); // 빈도 높은 순
            if (freqCompare != 0) {
                return freqCompare;
            }
            int lengthCompare = Integer.compare(w2.length(), w1.length());  // 길이 긴 순
            if (lengthCompare != 0) {
                return lengthCompare;
            }
            return w1.compareTo(w2);  // 알파벳 사전 순
        });
        
        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append("\n");
        }
        System.out.print(sb.toString());
    }
}
