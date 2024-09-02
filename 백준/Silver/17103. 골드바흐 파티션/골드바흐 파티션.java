import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxN = 1000000; // 문제에서 주어진 N의 최대값
        boolean[] isPrime = new boolean[maxN + 1];
        
        // 에라토스테네스의 체로 소수 판별
        for (int i = 2; i <= maxN; i++) {
            isPrime[i] = true;
        }
        
        for (int i = 2; i * i <= maxN; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= maxN; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        int t = scan.nextInt(); // 테스트 케이스 수
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt(); // 각 테스트 케이스의 짝수 N
            int count = 0;
            
            // n을 두 소수의 합으로 나타낼 수 있는 경우의 수 찾기
            for (int j = 2; j <= n / 2; j++) {
                if (isPrime[j] && isPrime[n - j]) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
    }
}
