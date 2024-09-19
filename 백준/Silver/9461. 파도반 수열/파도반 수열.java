import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        long[] dp = new long[101];
        dp[1] = dp[2] = dp[3] = 1;

        for (int i = 4; i <= 100; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }

        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            System.out.println(dp[n]);
        }
        scan.close();
    }

}