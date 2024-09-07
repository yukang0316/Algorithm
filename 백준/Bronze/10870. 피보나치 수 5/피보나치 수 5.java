import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long result = fibonachi(n);

        System.out.println(result);

    }

    public static long fibonachi(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fibonachi(n-1)+fibonachi(n-2);
        }
    }

}
