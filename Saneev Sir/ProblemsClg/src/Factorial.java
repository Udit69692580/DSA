import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
        int f=fact(n);
        System.out.println(f);
    }
    static int fact(int n){
        if(n==0){
            return 1;
        }
        int sans=fact(n-1);
        int ans= n*sans;
        return ans;
    }
}
