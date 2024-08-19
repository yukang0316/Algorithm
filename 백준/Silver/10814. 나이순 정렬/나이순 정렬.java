import java.util.*;

class Info{
    int age;
    String name;

    @Override
    public String toString() {
        return age +" "+ name;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Info> list = new ArrayList<>();
        int n;
        n = scan.nextInt();

        for(int i=0; i<n; i++){
            Info info = new Info();
            info.age = scan.nextInt();
            info.name = scan.next();
            list.add(info);
        }


        Collections.sort(list, new Comparator<Info>() {
            @Override
            public int compare(Info o1, Info o2) {
                if(o1.age > o2.age){
                    return 1;
                }else if (o1.age < o2.age)
                    return -1;
                else {
                    return 0;
                }
            }

        });

        for(Info info: list){
            System.out.println(info);
        }

    }
}
