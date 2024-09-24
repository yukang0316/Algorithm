import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // 수열의 길이
        int[] arr = new int[n];  // 수열 배열
        
        // 입력 배열 받기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 동적 프로그래밍 배열 선언
        int[] dp = new int[n];
        dp[0] = arr[0];  // 초기값 설정
        int maxSum = dp[0];  // 최종 최대값
        
        // 동적 프로그래밍 점화식을 이용해 최대 부분합 계산
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
            maxSum = Math.max(maxSum, dp[i]);  // 현재까지의 최대값 갱신
        }
        
        // 결과 출력
        System.out.println(maxSum);
        
        sc.close();
    }
}