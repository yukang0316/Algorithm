import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        
        int diagonal = 0; // 대각선 번호
        int sum = 0;      // 대각선까지의 합
        
        // X가 속하는 대각선 번호 찾기
        while (sum < X) {
            diagonal++;
            sum += diagonal;
        }
        
        int count = sum - X; // X가 해당 대각선에서 몇 번째인지 계산
        
        int numerator;   // 분자
        int denominator; // 분모
        
        if (diagonal % 2 == 0) {
            // 짝수 대각선인 경우
            numerator = diagonal - count;
            denominator = count + 1;
        } else {
            // 홀수 대각선인 경우
            numerator = count + 1;
            denominator = diagonal - count;
        }
        
        System.out.println(numerator + "/" + denominator);
    }
}
