import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        int n = scan.nextInt();

        // 처음에 ChongChong은 무지개 댄스를 춤
        set.add("ChongChong");

        for (int i = 0; i < n; i++) {
            String a = scan.next();
            String b = scan.next();

            // 둘 중 하나가 이미 무지개 댄스를 추고 있으면 둘 다 추가
            if (set.contains(a) || set.contains(b)) {
                set.add(a);
                set.add(b);
            }
        }

        // 최종적으로 무지개 댄스를 추는 사람의 수를 출력
        System.out.println(set.size());
    }
}