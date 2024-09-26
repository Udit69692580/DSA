import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(add(n));
    }
    static int add(int n){
        if (n==0){
            return 0;
        }
        if (n%2==0){
            return add(n-1)-n;
        }
        if (n%2!=0){
            return add(n-1)+n;
        }
        return -1;
    }
}
