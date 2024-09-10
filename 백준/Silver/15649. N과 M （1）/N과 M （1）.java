import java.util.Scanner;

public class Main {
    static int N, M;
    static boolean[] visited;  // 방문 여부를 확인하는 배열
    static int[] result;       // 선택된 수열을 저장하는 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();  // N까지의 수
        M = sc.nextInt();  // M개의 수를 고름

        visited = new boolean[N + 1];  // 1부터 N까지의 방문 여부를 확인
        result = new int[M];           // M개의 수열을 저장

        // 백트래킹 시작
        backtrack(0);
    }

    // 백트래킹 함수
    public static void backtrack(int depth) {
        // M개의 수를 모두 선택한 경우
        if (depth == M) {
            // 선택한 수열 출력
            for (int i = 0; i < M; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }

        // 1부터 N까지의 숫자를 선택
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {  // 아직 선택하지 않은 숫자
                visited[i] = true;  // 숫자 i를 선택했음을 표시
                result[depth] = i;  // 수열의 현재 자리에 i를 저장
                backtrack(depth + 1);  // 다음 깊이로 탐색
                visited[i] = false;  // 선택을 해제하고 되돌아가기
            }
        }
    }
}
