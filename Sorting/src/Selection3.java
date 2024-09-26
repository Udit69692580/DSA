import java.util.Scanner;

public class Selection3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        selectionsort(arr,n);
        for (int a:arr){
            System.out.print(a+" ");
        }
    }
    static void selectionsort(int[] arr,int n){
        for (int i=0;i<n-1;i++){
            int max=i;
            for (int j=i+1;j<n;j++){
                if (arr[j]>arr[max]){
                    max=j;
                }

            }
            int temp=arr[max];
            arr[max]=arr[i];
            arr[i]=temp;

        }
    }
}
