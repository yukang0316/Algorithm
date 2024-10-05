import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 연산의 개수

        // 기본적으로 PriorityQueue는 최소 힙이므로, 역순으로 저장해서 최대 힙으로 사용
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            
            if (x > 0) {
                // 자연수 x는 최대 힙에 추가
                maxHeap.add(x);
            } else {
                // x == 0 인 경우
                if (maxHeap.isEmpty()) {
                    System.out.println(0);  // 힙이 비어 있으면 0 출력
                } else {
                    System.out.println(maxHeap.poll());  // 가장 큰 값을 출력하고 제거
                }
            }
        }

        sc.close();
    }
}
