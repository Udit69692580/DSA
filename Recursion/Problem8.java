import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter k");
        int k =sc.nextInt();
        multipels(n,k);
//        System.out.println(ans);
    }
    static void multipels(int n,int k){
        if (k==1){
            System.out.print(n +" ");
            return;
        }
        multipels(n,k-1);
        System.out.print(n*k+" ");

    }
}
