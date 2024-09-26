import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a number");
        int n=sc.nextInt();
        System.out.println(findSum(n));
    }
    static int findSum(int n){
        if (n==0) return 0;
        return findSum(n-1)+n;
    }
}
