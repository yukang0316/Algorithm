import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> indexes = new ArrayList<>(); // 풍선의 인덱스 저장용

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
            indexes.add(i + 1); // 풍선 번호 1부터 시작
        }

        int idx = 0; // 현재 위치
        while (!list.isEmpty()) {
            int next = list.get(idx);  // 현재 인덱스의 값을 가져옴
            System.out.print(indexes.get(idx) + " "); // 현재 풍선의 번호 출력
            
            list.remove(idx);  // 현재 인덱스의 값을 제거
            indexes.remove(idx); // 풍선 번호 리스트에서도 제거

            if (list.isEmpty()) {
                break; // 모든 풍선을 터뜨렸으면 종료
            }

            // 다음 인덱스 계산
            if (next > 0) {
                // 양수일 경우 오른쪽으로 이동 (현재 위치는 이미 터뜨렸으므로 -1 보정)
                idx = (idx + next - 1) % list.size();
            } else {
                // 음수일 경우 왼쪽으로 이동 (음수 보정 필요)
                idx = (idx + next) % list.size();
                if (idx < 0) { // 음수인 경우 리스트 크기 보정
                    idx += list.size();
                }
            }
        }
    }
}
