import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // 최대공약수를 구하는 메소드
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] positions = new int[n];
        
        for (int i = 0; i < n; i++) {
            positions[i] = scan.nextInt();
        }

        // 가로수 간의 간격을 구합니다.
        int[] gaps = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            gaps[i] = positions[i + 1] - positions[i];
        }

        // 모든 간격의 최대공약수를 구합니다.
        int gcdValue = gaps[0];
        for (int i = 1; i < gaps.length; i++) {
            gcdValue = gcd(gcdValue, gaps[i]);
        }

        // 추가로 심어야 하는 가로수의 수를 계산합니다.
        int totalNewTrees = 0;
        for (int gap : gaps) {
            totalNewTrees += (gap / gcdValue) - 1;
        }

        System.out.println(totalNewTrees);
    }
}
