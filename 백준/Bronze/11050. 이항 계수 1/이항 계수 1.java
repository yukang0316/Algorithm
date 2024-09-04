import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, k;
        n = scan.nextInt();
        k = scan.nextInt();

        int result = factorial(n) / (factorial(n-k) * factorial(k));
        System.out.println(result);
    }

    public static int factorial(int num){
        if(num>1) return num * factorial(num-1);
        else return 1;
    }

}