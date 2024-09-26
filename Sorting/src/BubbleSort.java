import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+ n+" elements of the array");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        bubble(arr,n);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    static void bubble(int[] arr,int n){
        for (int i=0;i<n-1;i++){
            boolean flag=false;//has any swapping happens
            for (int j=i+1;j<n-i-1;j++){
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    flag=true;
                }
            }
            if (flag==false){
                return;//if no swapping is happen then array is already sorted
            }
        }
    }
}
