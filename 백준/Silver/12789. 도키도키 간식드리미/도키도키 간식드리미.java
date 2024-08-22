import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            queue.add(scan.nextInt());
        }

        int currentNumber = 1;

        while (!queue.isEmpty()) {
            if (queue.peekFirst() == currentNumber) {
                queue.removeFirst();
                currentNumber++;
            } else {
                stack.addLast(queue.pollFirst());
            }

            // 스택의 마지막 요소가 currentNumber와 일치하면 통과시킴
            while (!stack.isEmpty() && stack.peekLast() == currentNumber) {
                stack.removeLast();
                currentNumber++;
            }
        }

        // 모든 과정을 끝냈을 때 스택이 비었는지 확인
        if (stack.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}
