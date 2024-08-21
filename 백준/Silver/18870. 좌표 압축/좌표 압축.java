import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // N 입력 받기
        int N = scanner.nextInt();
        int[] coordinates = new int[N];
        
        // 좌표들 입력 받기
        for (int i = 0; i < N; i++) {
            coordinates[i] = scanner.nextInt();
        }
        
        // 압축할 좌표들의 복사본을 만듦
        int[] sortedCoordinates = coordinates.clone();
        
        // 좌표들을 정렬하고 중복 제거
        Arrays.sort(sortedCoordinates);
        Map<Integer, Integer> compressionMap = new HashMap<>();
        
        int rank = 0;
        for (int coord : sortedCoordinates) {
            if (!compressionMap.containsKey(coord)) {
                compressionMap.put(coord, rank);
                rank++;
            }
        }
        
        // 결과를 출력
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            result.append(compressionMap.get(coordinates[i])).append(" ");
        }
        
        // 결과 출력
        System.out.println(result.toString().trim());
    }
}