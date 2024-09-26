import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
       int val= countOfDigits(n);
        System.out.println(val);
    }
    static int countOfDigits(int n){
        if(n>=0 && n<=9){
            return 1;
        }
       int anspre= countOfDigits(n/10);
        int ans = anspre+1;
        return ans;
    }
}
