import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int moveCount = 0;  // 이동 횟수 카운트

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        // 하노이 탑 이동 수행
        hanoi(N, 1, 3, 2);
        
        // 총 이동 횟수 출력
        System.out.println(moveCount);
        
        // 이동 과정 출력
        System.out.println(sb.toString());
    }

    // 하노이 탑 재귀 함수
    public static void hanoi(int n, int from, int to, int via) {
        if (n == 1) {
            // 원판 1개를 목적지로 바로 이동
            moveCount++;
            sb.append(from + " " + to + "\n");
            return;
        }
        
        // N-1개의 원판을 from에서 via로 이동
        hanoi(n - 1, from, via, to);
        
        // 가장 큰 원판을 목적지로 이동
        moveCount++;
        sb.append(from + " " + to + "\n");
        
        // N-1개의 원판을 via에서 목적지로 이동
        hanoi(n - 1, via, to, from);
    }
}