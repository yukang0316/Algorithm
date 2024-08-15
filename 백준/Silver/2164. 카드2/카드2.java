import java.util.ArrayDeque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = scan.nextInt();

        for(int i=1; i<=n; i++){
            stack.addFirst(i);
        }

        while(stack.size() != 1){
            stack.removeLast();
            int a = stack.getLast();
            stack.addFirst(a);
            stack.removeLast();
        }

        System.out.println(stack.getLast());

    }
}
