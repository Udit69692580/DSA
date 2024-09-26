import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        if(x<70){
            System.out.println("Order confirmed"+"\n"+"Thenk You!");
        }else{
            System.out.println("Order Limit reached End"+"\n"+"Thank You");
        }

    }
}
