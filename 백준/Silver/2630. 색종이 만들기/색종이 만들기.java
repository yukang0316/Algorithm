import java.util.Scanner;

public class Main {
    static int[][] paper;  // 종이의 색상 정보
    static int whiteCount = 0;  // 하얀색 색종이 개수
    static int blueCount = 0;   // 파란색 색종이 개수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 종이의 크기
        paper = new int[N][N];

        // 종이의 색상 정보 입력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                paper[i][j] = sc.nextInt();
            }
        }

        // 전체 종이에 대해 분할 정복 수행
        divide(0, 0, N);

        // 결과 출력
        System.out.println(whiteCount);  // 하얀색 색종이 개수
        System.out.println(blueCount);   // 파란색 색종이 개수

        sc.close();
    }

    // (row, col)에서 시작하는 크기 size의 종이를 처리하는 함수
    public static void divide(int row, int col, int size) {
        if (checkColor(row, col, size)) {
            // 모두 같은 색이라면, 해당 색에 따라 카운트 증가
            if (paper[row][col] == 0) {
                whiteCount++;
            } else {
                blueCount++;
            }
        } else {
            // 4개의 작은 종이로 나눔
            int newSize = size / 2;
            divide(row, col, newSize);  // 1사분면
            divide(row, col + newSize, newSize);  // 2사분면
            divide(row + newSize, col, newSize);  // 3사분면
            divide(row + newSize, col + newSize, newSize);  // 4사분면
        }
    }

    // (row, col)에서 시작하는 size 크기의 종이가 모두 같은 색인지 확인하는 함수
    public static boolean checkColor(int row, int col, int size) {
        int color = paper[row][col];
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (paper[i][j] != color) {
                    return false;  // 다른 색이 있으면 false 반환
                }
            }
        }
        return true;  // 모두 같은 색이면 true 반환
    }
}
