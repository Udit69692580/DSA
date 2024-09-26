import java.util.Scanner;

public class Bubbleprac {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubblesort(arr,n);
        for (int a:arr){
            System.out.print(a+" ");
        }

    }
    static void bubblesort(int[] arr,int n){
        for (int i=0;i<n-1;i++){
            int min=i;
            for (int j=i+1;j<n-1;j++){
                if (arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
}
