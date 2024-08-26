import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // 입력받은 자연수 N
        int result = 0; // 생성자 초기값 (없으면 0 출력)

        // N에서 가능한 탐색 시작점은 N - 9 * 자리수의 개수
        for (int i = Math.max(1, N - String.valueOf(N).length() * 9); i < N; i++) {
            int sum = i; // 현재 수 i
            int num = i;

            // 각 자리수의 합을 구함
            while (num > 0) {
                sum += num % 10; // 마지막 자리수 더하기
                num /= 10; // 다음 자리수로 이동
            }

            // 분해합이 N과 같은지 확인
            if (sum == N) {
                result = i; // 가장 작은 생성자 찾음
                break; // 찾았으므로 반복 종료
            }
        }

        System.out.println(result); // 결과 출력
    }
}
