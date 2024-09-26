import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        natural(n);
    }
    static void natural(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        natural(n-1);
    }
}
