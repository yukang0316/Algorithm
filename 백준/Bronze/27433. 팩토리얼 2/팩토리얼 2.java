import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long result = factorial(n);

        System.out.println(result);

    }

    public static long factorial(int n){
        if(n<=1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

}
