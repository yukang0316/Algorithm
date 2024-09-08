import java.util.Scanner;

public class Main {
    static int fibCount = 0;  // 코드1이 실행되는 횟수 (재귀 호출)
    static int fibonacciCount = 0;  // 코드2가 실행되는 횟수 (동적 프로그래밍)
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 재귀 방식으로 피보나치 수 계산
        fib(n);
        
        // 동적 프로그래밍 방식으로 피보나치 수 계산
        fibonacci(n);
        
        // 결과 출력
        System.out.println(fibCount + " " + fibonacciCount);
    }
    
    // 재귀 호출 방식 (fib)
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            fibCount++;  // 코드1 실행
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    
    // 동적 프로그래밍 방식 (fibonacci)
    public static int fibonacci(int n) {
        int[] f = new int[n + 1];
        f[1] = f[2] = 1;
        
        for (int i = 3; i <= n; i++) {
            fibonacciCount++;  // 코드2 실행
            f[i] = f[i - 1] + f[i - 2];
        }
        
        return f[n];
    }
}