import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // 삼중 루프의 총 수행 횟수 계산: (n * (n-1) * (n-2)) / 6
        long count = (long) n * (n - 1) * (n - 2) / 6;
        System.out.println(count);

        // 최고차항의 차수는 3
        System.out.println(3);
    }
}
