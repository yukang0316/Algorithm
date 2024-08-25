import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt(); // 10진법 수
        int B = scan.nextInt(); // 변환할 진법
        
        System.out.println(convertToBase(N, B));
    }
    
    public static String convertToBase(int number, int base) {
        StringBuilder result = new StringBuilder();
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // 숫자와 알파벳을 포함한 진법 변환 문자들
        
        while (number > 0) {
            int remainder = number % base; // 나머지를 구함
            result.append(chars.charAt(remainder)); // 나머지에 해당하는 문자 추가
            number /= base; // number를 base로 나눔
        }
        
        return result.reverse().toString(); // 거꾸로 추가했기 때문에 reverse 필요
    }
}
