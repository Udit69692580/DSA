import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int count = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(count + " ");
                count++;
                if(count > 15) {
                    break;
                }
            }
            System.out.println();
            if(count > 15) {
                break;
            }
        }
    }
}
