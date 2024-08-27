import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // N번째 종말의 수를 찾기 위한 입력
        int count = 0; // 종말의 수를 세는 변수
        int number = 666; // 첫 번째 종말의 수

        while (true) {
            // 현재 숫자에 '666'이 포함되어 있는지 확인
            if (String.valueOf(number).contains("666")) {
                count++; // 종말의 수 찾음
            }
            
            // N번째 종말의 수를 찾으면 종료
            if (count == N) {
                System.out.println(number);
                break;
            }

            number++; // 다음 숫자로 이동
        }
    }
}
