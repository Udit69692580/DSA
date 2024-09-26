import java.util.Scanner;

public class SelectionSort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+ n+" elements of the array");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int []ans=selection(arr,n);
        for (int a:ans){
            System.out.print(a +" ");
        }

    }
    static int[] selection(int[] arr,int n){
        int[] ans=new int[n];
        for (int i=0;i<n;i++){
           int min= minElement(arr,0,n);
            ans[i]=arr[min];
            arr[min]=Integer.MAX_VALUE;
        }
        return ans;

    }
    static int minElement(int[] arr,int start,int end){
        int min=start;
        for (int i=start;i<end;i++){
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        return min;
    }
}
