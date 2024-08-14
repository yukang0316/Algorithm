import java.util.ArrayDeque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine(); // 개행 문자 처리

        for (int i = 0; i < t; i++) {
            String input = scan.nextLine();
            ArrayDeque<Character> stack = new ArrayDeque<>();
            boolean isValid = true;

            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);

                if (c == '(') {
                    stack.addLast(c);
                } else if (c == ')') {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    } else {
                        stack.removeLast();
                    }
                }
            }

            // 스택이 비어있고 isValid가 true이면 올바른 괄호 문자열
            if (isValid && stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
