import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] numbers = new int[n];
        int[] frequency = new int[8001]; // -4000 ~ 4000까지의 빈도를 저장할 배열
        int sum = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = scan.nextInt();
            sum += numbers[i];
            frequency[numbers[i] + 4000]++; // 음수 값을 처리하기 위해 +4000
        }

        // 1. 산술평균
        double mean = (double) sum / n;
        System.out.println(Math.round(mean)); // 반올림하여 출력

        // 2. 중앙값
        Arrays.sort(numbers);
        System.out.println(numbers[n / 2]);

        // 3. 최빈값
        int maxFreq = 0;
        List<Integer> freqList = new ArrayList<>();
        for (int i = 0; i < 8001; i++) {
            if (frequency[i] > maxFreq) {
                maxFreq = frequency[i];
                freqList.clear(); // 기존 값 초기화
                freqList.add(i - 4000); // 음수 처리
            } else if (frequency[i] == maxFreq) {
                freqList.add(i - 4000);
            }
        }

        // 최빈값이 여러 개 있을 경우, 두 번째로 작은 값 출력
        if (freqList.size() > 1) {
            Collections.sort(freqList);
            System.out.println(freqList.get(1));
        } else {
            System.out.println(freqList.get(0));
        }

        // 4. 범위
        int range = numbers[n - 1] - numbers[0]; // 정렬된 상태에서 최댓값과 최솟값의 차이
        System.out.println(range);
    }
}
