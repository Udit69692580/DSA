import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter n1:");
        int n1=sc.nextInt();
        System.out.println("Enter n2:");
        int n2=sc.nextInt();
        System.out.println(gcd(n1,n2));
    }
    static int gcd(int n1,int n2){
        if (n1==0&&n2!=0) return n2;
        if (n2==0&&n1!=0) return n1;
//        return gcd(n2,n1%n2); //for gcd
         int g= gcd(n2,n1%n2);//for lcm
         int lcm = n1*n2/g;
         return lcm;
    }
}
