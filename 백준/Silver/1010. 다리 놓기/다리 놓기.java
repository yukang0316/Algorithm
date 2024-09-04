import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int m = scan.nextInt();

            long result = binomialCoefficient(m, n);
            System.out.println(result);
        }
    }

    // 이항 계수를 계산하는 메서드
    public static long binomialCoefficient(int m, int n) {
        // nCk 계산 시, k = 0 또는 k = n 일 때 결과는 1
        if (n == 0 || n == m) {
            return 1;
        }
        long result = 1;
        // nCm = m! / (n! * (m-n)!)
        // 최적화된 계산: (m * (m-1) * ... * (m-n+1)) / (n * (n-1) * ... * 1)
        for (int i = 0; i < n; i++) {
            result *= (m - i);
            result /= (i + 1);
        }
        return result;
    }
}
