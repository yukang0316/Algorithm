import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        ArrayList<Point> points = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points.add(new Point(x, y));
        }

        Collections.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if (p1.y == p2.y) {
                    return Integer.compare(p1.x, p2.x);
                } else {
                    return Integer.compare(p1.y, p2.y);
                }
            }
        });

        for (Point p : points) {
            System.out.println(p.x + " " + p.y);
        }

        scanner.close();
    }
}
