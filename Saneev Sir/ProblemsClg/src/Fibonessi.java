import java.util.Scanner;

public class Fibonessi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            System.out.print("0");
            if (n > 1) {
                System.out.print(" 1");
            }
            fibo(n - 2, 0, 1);
        }
    }

    static void fibo(int n, int prev1, int prev2) {
        if (n <= 0) return;
        int next = prev1 + prev2;
        System.out.print(" " + next);
        fibo(n - 1, prev2, next);
    }
}
