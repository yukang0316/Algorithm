import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        do{
            n = scan.nextInt();
            int count = 0;
            if(n == 0)break;

            for (int i = n+1; i <= 2*n; i++) {
                if(isPrime(i)) {
                    count++;
                }
            }
            System.out.println(count);
        }while(n != 0);

    }

    public static boolean isPrime(int n){
        if(n<2)return false;
        if(n==2)return true;
        if(n%2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }

}