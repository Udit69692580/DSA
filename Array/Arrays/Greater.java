import java.util.*;
public class Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr [] =new int[n];
        System.out.println("Enter the element of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter x");
        int x=sc.nextInt();
        System.out.println(strictlyGreater(arr,x));

    }
    static int strictlyGreater(int[] arr,int x){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count++;
            }
        }
        return count;
    }
}
