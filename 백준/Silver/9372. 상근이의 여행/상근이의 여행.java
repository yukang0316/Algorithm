import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // 국가의 수
            int M = sc.nextInt(); // 비행기의 종류 (간선 수)

            // 비행기 정보는 입력으로 받지만, 사실상 N-1개만 필요하므로 저장할 필요는 없음
            for (int i = 0; i < M; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                // a와 b 사이의 비행기 경로가 주어짐 (사용되지 않음)
            }

            // 최소 비행기 수는 항상 국가의 수 - 1
            System.out.println(N - 1);
        }

        sc.close();
    }
}
