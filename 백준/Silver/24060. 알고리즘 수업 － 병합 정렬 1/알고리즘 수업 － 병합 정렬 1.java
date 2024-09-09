import java.util.Scanner;

public class Main {
    static int[] A, tmp;
    static int count = 0;
    static int K, result = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 배열의 크기
        K = sc.nextInt();      // K번째 저장되는 수를 구함
        
        A = new int[N];
        tmp = new int[N];  // 병합 과정에서 임시로 사용할 배열
        
        // 배열 A 입력
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        // 병합 정렬 수행
        mergeSort(0, N - 1);
        
        // 결과 출력
        System.out.println(result);
    }

    // 병합 정렬 함수
    public static void mergeSort(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(left, mid);      // 왼쪽 절반 정렬
            mergeSort(mid + 1, right); // 오른쪽 절반 정렬
            merge(left, mid, right);   // 병합 과정
        }
    }

    // 병합 함수
    public static void merge(int left, int mid, int right) {
        int i = left, j = mid + 1, t = left;

        // 두 부분 배열을 병합하는 과정
        while (i <= mid && j <= right) {
            if (A[i] <= A[j]) {
                tmp[t++] = A[i++];
            } else {
                tmp[t++] = A[j++];
            }
        }

        // 왼쪽 배열이 남은 경우
        while (i <= mid) {
            tmp[t++] = A[i++];
        }

        // 오른쪽 배열이 남은 경우
        while (j <= right) {
            tmp[t++] = A[j++];
        }

        // tmp 배열을 A에 복사하면서 저장 횟수를 카운트
        for (int k = left; k <= right; k++) {
            A[k] = tmp[k];
            count++;  // 저장할 때마다 카운트를 증가시킴
            if (count == K) {
                result = A[k];  // K번째 저장되는 값
            }
        }
    }
}