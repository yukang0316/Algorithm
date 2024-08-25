import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt(); // 낮 동안 올라가는 미터
        int B = scan.nextInt(); // 밤 동안 미끄러지는 미터
        int V = scan.nextInt(); // 목표 높이

        // 목표에 도달하기 위해 필요한 날 계산
        int days = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0) {
            days++; // 나머지가 있으면 하루 더 필요
        }

        System.out.println(days); // 결과 출력
    }
}

