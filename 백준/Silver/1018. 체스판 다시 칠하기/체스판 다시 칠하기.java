import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();  // N x M 보드의 행 수
        int m = scan.nextInt();  // N x M 보드의 열 수
        scan.nextLine(); // 개행 문자 소비

        String[] board = new String[n];
        for (int i = 0; i < n; i++) {
            board[i] = scan.nextLine();  // 보드의 상태를 입력받음
        }

        int minPaints = Integer.MAX_VALUE;

        // 모든 8x8 서브 보드를 검사
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                minPaints = Math.min(minPaints, countRepaints(board, i, j));
            }
        }

        System.out.println(minPaints);
    }

    // (startRow, startCol)에서 시작하는 8x8 서브 보드의 다시 칠해야 하는 칸의 수 계산
    private static int countRepaints(String[] board, int startRow, int startCol) {
        int countW = 0; // 'W'로 시작하는 패턴에 대해 칠해야 하는 칸 수
        int countB = 0; // 'B'로 시작하는 패턴에 대해 칠해야 하는 칸 수

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char current = board[startRow + i].charAt(startCol + j);

                // 예상되는 색깔 계산
                char expectedW = ((i + j) % 2 == 0) ? 'W' : 'B'; // 'W'로 시작하는 패턴
                char expectedB = ((i + j) % 2 == 0) ? 'B' : 'W'; // 'B'로 시작하는 패턴

                if (current != expectedW) countW++;
                if (current != expectedB) countB++;
            }
        }

        return Math.min(countW, countB); // 두 패턴 중 최소값 반환
    }
}
