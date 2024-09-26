import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 elements :");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("values before swap n1 :"+n1);
        System.out.println("values before swap n2 :"+n2);
        swapNum(n1,n2);



    }
    static void swapNum(int n1,int n2){
        int temp=n1;
        n1 =n2;
        n2 = temp;
        System.out.println("value after swap n1 :"+n1);
        System.out.println("value after swap n2 :"+n2);
//        n2 =n1;
//        System.out.println();
    }
}
