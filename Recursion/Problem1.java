import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size of the array");
        int n= sc.nextInt();
        int[] arr = new int[n+1];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array location");
        int loc = sc.nextInt();
        System.out.println("Enter insert element");
        int e=sc.nextInt();
        insert(arr,n,loc,e);
        printArray(arr,n);
    }
    static void insert(int[] arr,int n,int loc,int e){
        for (int i=n;i>loc;i--){
            arr[i]=arr[i-1];
        }
        arr[loc]=e;
        n++;
    }
    static void printArray(int[] arr,int n){
        for (int i=0;i<n+1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println( );
    }

}
