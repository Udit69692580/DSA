import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p:");
        int p=sc.nextInt();
        System.out.println("Enter q:");
        int q= sc.nextInt();
//        int po=pow(p,q);
        System.out.println(pow(p,q));
    }
    static int pow(int p,int q){
        if (q==0){
            return 1;
        }
        int anspre=pow(p,q-1);
        int ans = anspre*p;
        return ans;
    }
}
