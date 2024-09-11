import java.util.Scanner;

public class Main {

    // 칸토어 집합을 생성하는 재귀 함수
    public static void createCantorSet(char[] array, int start, int length) {
        // 길이가 1이면 더 이상 나눌 수 없으므로 종료
        if (length == 1) {
            return;
        }

        // 3등분하여 가운데 부분을 공백으로 변경
        int third = length / 3;

        // 가운데 부분을 공백으로 설정
        for (int i = start + third; i < start + 2 * third; i++) {
            array[i] = ' ';
        }

        // 왼쪽과 오른쪽 부분에 대해 재귀 호출
        createCantorSet(array, start, third);             // 왼쪽 부분
        createCantorSet(array, start + 2 * third, third); // 오른쪽 부분
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int N = sc.nextInt(); // N값을 입력받음

            int length = (int) Math.pow(3, N); // 3^N 길이의 문자열을 만들기 위한 길이 계산
            char[] array = new char[length];

            // 처음에 모든 부분을 '-'로 초기화
            for (int i = 0; i < length; i++) {
                array[i] = '-';
            }

            // 칸토어 집합 생성
            createCantorSet(array, 0, length);

            // 결과 출력
            System.out.println(array);
        }
        
        sc.close();
    }
}