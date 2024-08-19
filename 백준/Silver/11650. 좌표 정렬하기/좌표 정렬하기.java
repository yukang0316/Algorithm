import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        ArrayList<int[]> points = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            points.add(new int[]{x, y});
        }

        // 정렬: x 기준으로, x가 같다면 y 기준으로 정렬
        Collections.sort(points, new Comparator<int[]>() {
            public int compare(int[] p1, int[] p2) {
                if (p1[0] == p2[0]) {
                    return Integer.compare(p1[1], p2[1]);
                } else {
                    return Integer.compare(p1[0], p2[0]);
                }
            }
        });

        // 출력
        for (int[] point : points) {
            System.out.println(point[0] + " " + point[1]);
        }
    }
}