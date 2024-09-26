import java.util.Scanner;

public class GcdBrutForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 =sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(gcd(n1,n2));

    }
    static int gcd(int n1,int n2) {
//        if (n1==0&&n2!=0) return n2;
//        if (n2==0&&n1!=0) return n1;
//        if (n1==0&&n2==0) return 0;
//        int minNum=0;
//        if (n1<n2){
//            minNum=n1;
//        }else {
//            minNum=n2;
//        }
//        int ans =0;
//        for (int i=minNum;i>0;i--){
//            if (n1%i==0 && n2%i==0){
//                ans =i;
//                break;
//            }
//        }
//        return ans;
//        lONG DIVISION METHOD
        while (n1%n2!=0){
            int rem=n1%n2;
            n1=n2;
            n2=rem;
        }
        return n2;
    }
}
