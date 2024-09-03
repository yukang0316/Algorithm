import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        int num = 1;

        for(int i=1; i<=n; i++){
            num *= 2;
        }

        System.out.println(num);
    }



}