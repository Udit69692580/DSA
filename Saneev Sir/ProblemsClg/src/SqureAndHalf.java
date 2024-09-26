import java.util.Scanner;

public class SqureAndHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        System.out.println(half(n));
    }
    static int square(int n){
        return n*n;
    }
    static int half(int n){
        int squre=square(n);
        System.out.println(squre);
        return squre/2;
    }
}
