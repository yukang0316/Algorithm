import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        int n = scan.nextInt();
        int totalCount = 0;
        String s;

        for (int i = 0; i < n; i++) {
            s = scan.next();
            if (s.equals("ENTER")) {
                // 새로운 인사가 시작됨. 지금까지의 인사 횟수를 유지하고, 새롭게 카운트 시작
                set.clear();
            } else {
                // 새로운 인사로 간주되는 경우 카운트 증가
                if (!set.contains(s)) {
                    set.add(s);
                    totalCount++;
                }
            }
        }

        System.out.println(totalCount);
    }
}