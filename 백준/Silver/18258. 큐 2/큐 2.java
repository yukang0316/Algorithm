import java.io.*;
import java.util.ArrayDeque;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");

            switch(command[0]) {
                case "push":
                    int num = Integer.parseInt(command[1]);
                    queue.addLast(num);
                    break;
                case "pop":
                    if(queue.isEmpty()) {
                        bw.write("-1\n");
                    }
                    else {
                        bw.write(queue.removeFirst() + "\n");
                    }
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    if(queue.isEmpty()) bw.write("1\n");
                    else bw.write("0\n");
                    break;
                case "front":
                    if(queue.isEmpty()) bw.write("-1\n");
                    else bw.write(queue.getFirst() + "\n");
                    break;
                case "back":
                    if(queue.isEmpty()) bw.write("-1\n");
                    else bw.write(queue.getLast() + "\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
