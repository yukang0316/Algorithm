import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();

        // N 이하의 완전 제곱수의 개수를 구함
        long result = (long)Math.sqrt(n);

        System.out.println(result);
    }
}
