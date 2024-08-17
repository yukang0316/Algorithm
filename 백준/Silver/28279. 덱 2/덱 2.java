import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        StringBuilder output = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            int a = Integer.parseInt(input[0]);

            switch (a) {
                case 1:
                    int x1 = Integer.parseInt(input[1]);
                    deque.addFirst(x1);
                    break;
                case 2:
                    int x2 = Integer.parseInt(input[1]);
                    deque.addLast(x2);
                    break;
                case 3:
                    if (!deque.isEmpty()) {
                        output.append(deque.removeFirst()).append("\n");
                    } else {
                        output.append("-1\n");
                    }
                    break;
                case 4:
                    if (!deque.isEmpty()) {
                        output.append(deque.removeLast()).append("\n");
                    } else {
                        output.append("-1\n");
                    }
                    break;
                case 5:
                    output.append(deque.size()).append("\n");
                    break;
                case 6:
                    if (deque.isEmpty()) {
                        output.append("1\n");
                    } else {
                        output.append("0\n");
                    }
                    break;
                case 7:
                    if (!deque.isEmpty()) {
                        output.append(deque.getFirst()).append("\n");
                    } else {
                        output.append("-1\n");
                    }
                    break;
                case 8:
                    if (!deque.isEmpty()) {
                        output.append(deque.getLast()).append("\n");
                    } else {
                        output.append("-1\n");
                    }
                    break;
            }
        }

        System.out.print(output.toString());
    }
}
