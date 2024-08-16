import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String s = scan.nextLine();
            if (s.equals(".")) {
                break; // "." 입력 시 프로그램 종료
            }

            ArrayDeque<Character> stack = new ArrayDeque<>();
            boolean isBalanced = true;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (ch == '(' || ch == '[') {
                    stack.addLast(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty() || stack.getLast() != '(') {
                        isBalanced = false;
                        break;
                    }
                    stack.removeLast();
                } else if (ch == ']') {
                    if (stack.isEmpty() || stack.getLast() != '[') {
                        isBalanced = false;
                        break;
                    }
                    stack.removeLast();
                }
            }

            if (!stack.isEmpty()) {
                isBalanced = false;
            }

            if (isBalanced) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}