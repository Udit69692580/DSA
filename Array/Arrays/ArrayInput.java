import java.util.*;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n= sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the element of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array elements are ");
        for(int a:arr){
            System.out.println(a);
        }


    }
}
