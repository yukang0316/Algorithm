import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // N: 수의 개수, M: 구간 합을 구하는 횟수
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] arr = new int[N + 1];  // 원본 배열 (1-based indexing)
        int[] prefixSum = new int[N + 1];  // 누적 합 배열 (1-based indexing)
        
        // 원본 배열 입력
        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        
        // 구간 합을 구하는 쿼리 처리
        for (int q = 0; q < M; q++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(prefixSum[j] - prefixSum[i - 1]);
        }
        
        sc.close();
    }
}