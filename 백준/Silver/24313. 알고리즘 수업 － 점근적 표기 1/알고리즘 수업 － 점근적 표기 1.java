import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextInt();
        int a0 = scan.nextInt();
        int c = scan.nextInt();
        int n0 = scan.nextInt();

        // a1 <= c 인 경우는, O(n)의 정의를 만족할 가능성이 있음
        if (a1 > c) {
            System.out.println("0");
            return;
        }

        // a1 <= c 인 경우
        // (c - a1) * n >= a0 을 모든 n >= n0 에서 만족해야 함
        // 이 경우 n0부터 시작해서 조건을 검사해 보면 된다.
        boolean satisfies = true;
        for (int n = n0; n <= 100; n++) {
            if (a1 * n + a0 > c * n) {
                satisfies = false;
                break;
            }
        }

        if (satisfies) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
