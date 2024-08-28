import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // 수행 횟수는 (n-1)*n/2
        long count = (long) n * (n - 1) / 2;
        System.out.println(count);

        // 최고차항의 차수는 2
        System.out.println(2);
    }
}
