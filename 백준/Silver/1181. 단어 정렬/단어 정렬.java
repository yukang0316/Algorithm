import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int n;
        n = scan.nextInt();

        for(int i = 0; i < n; i++) {
            list.add(scan.next());
        }

        // 중복 제거
        Set<String> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);

        // 길이와 사전 순으로 정렬
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return o1.compareTo(o2);
                }
            }
        });

        // 결과 출력
        for(String s : list) {
            System.out.println(s);
        }
    }
}
