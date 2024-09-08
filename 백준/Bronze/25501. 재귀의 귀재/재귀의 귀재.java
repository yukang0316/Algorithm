import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static int rCount = 0;
    public static int recursion(String s, int l, int r){
        if(l >= r) {
            rCount++;
            return 1;
        }
        else if(s.charAt(l) != s.charAt(r)) {
            rCount++;
            return 0;
        }
        else {
            rCount++;
            return recursion(s, l+1, r-1);
        }
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            String s = scan.next();
            System.out.println(isPalindrome(s)+" "+rCount);
            rCount = 0;
        }

    }
}