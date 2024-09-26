import java.util.Scanner;

public class Insertionprac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ebter the size of the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("ENter the elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        insertion(arr,n);
        for (int a:arr){
            System.out.print(a+" ");
        }
    }
    static void insertion(int[] arr,int n){
        for (int i=1;i<n;i++){
            int j=i;
            while (j>0&&arr[j]>arr[j-1]){
                //swap
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
}
