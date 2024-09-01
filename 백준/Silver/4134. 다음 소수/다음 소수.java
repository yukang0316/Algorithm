import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();  // 테스트 케이스 개수

        for (int i = 0; i < t; i++) {
            long n = scan.nextLong();  // 각 테스트 케이스의 정수 n
            while (!isPrime(n)) {
                n++;
            }
            System.out.println(n);
        }
    }

    // 소수 판별 함수
    public static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false; // 2 이상의 짝수는 소수가 아님

        // 2와 3을 제외한 소수는 홀수임
        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
