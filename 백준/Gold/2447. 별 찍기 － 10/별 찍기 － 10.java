import java.util.Scanner;

public class Main {
    static char[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new char[N][N];

        // 배열을 '*'로 초기화
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = '*';
            }
        }

        // 재귀적으로 패턴 생성
        makePattern(0, 0, N);

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }

    // 재귀적으로 패턴을 만드는 함수
    public static void makePattern(int x, int y, int n) {
        // 더 이상 쪼갤 수 없는 경우 종료
        if (n == 1) {
            return;
        }

        // 3등분하여 가운데 부분을 공백으로 설정
        int div = n / 3;

        // 가운데 블록을 공백으로 설정
        for (int i = x + div; i < x + 2 * div; i++) {
            for (int j = y + div; j < y + 2 * div; j++) {
                arr[i][j] = ' ';
            }
        }

        // 나머지 8개 블록에 대해서 재귀 호출
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // 가운데 블록은 제외하고 재귀 호출
                if (i == 1 && j == 1) {
                    continue;
                }
                makePattern(x + i * div, y + j * div, div);
            }
        }
    }
}