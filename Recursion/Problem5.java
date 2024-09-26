import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum =sumOfDigits(n);
        System.out.println(sum);
    }
    static int sumOfDigits(int n){
        if(n>0 && n<=9){
            return n;
        }
        int smallAns =sumOfDigits(n/10);
        int ans = smallAns+n%10;
        return ans;
    }

}
