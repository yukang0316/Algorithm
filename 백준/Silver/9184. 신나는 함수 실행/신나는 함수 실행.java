import java.util.Scanner;

public class Main {
    static int[][][] dp = new int[21][21][21];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // 종료 조건
            if (a == -1 && b == -1 && c == -1) {
                break;
            }

            int result = w(a, b, c);

            // 결과 출력
            System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, result);
        }

        sc.close();
    }

    // 재귀 함수 구현 및 메모이제이션 적용
    public static int w(int a, int b, int c) {
        // a, b, c가 범위를 벗어나면 조정
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }

        // a, b, c가 20보다 크면 20으로 변경
        if (a > 20 || b > 20 || c > 20) {
            return w(20, 20, 20);
        }

        // 이미 계산한 값이면 반환
        if (dp[a][b][c] != 0) {
            return dp[a][b][c];
        }

        // 메모이제이션 적용하여 계산 및 저장
        if (a < b && b < c) {
            dp[a][b][c] = w(a, b, c - 1) 
                        + w(a, b - 1, c - 1) 
                        - w(a, b - 1, c);
        } else {
            dp[a][b][c] = w(a - 1, b, c) 
                        + w(a - 1, b - 1, c) 
                        + w(a - 1, b, c - 1) 
                        - w(a - 1, b - 1, c - 1);
        }

        return dp[a][b][c];
    }
}
