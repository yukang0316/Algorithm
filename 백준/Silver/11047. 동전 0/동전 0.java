import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 동전 종류의 개수
        int K = sc.nextInt(); // 목표 금액

        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = sc.nextInt();
        }

        int count = 0; // 동전 개수
        // 큰 가치의 동전부터 사용
        for (int i = N - 1; i >= 0; i--) {
            if (coins[i] <= K) { // 현재 동전 가치가 남은 금액보다 작거나 같을 때만 사용
                count += K / coins[i]; // 해당 동전으로 만들 수 있는 최대 개수 추가
                K %= coins[i]; // 남은 금액 갱신
            }
        }

        System.out.println(count); // 최소 동전 개수 출력
        sc.close();
    }
}
