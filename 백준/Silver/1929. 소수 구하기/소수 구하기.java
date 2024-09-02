import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m, n;
        m = scan.nextInt();
        n = scan.nextInt();

        for(int i=m; i<=n; i++){
            while(isPrime(i)){
                System.out.println(i);
                break;
            }
        }

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