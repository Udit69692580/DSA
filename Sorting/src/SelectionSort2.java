import java.util.Scanner;

public class SelectionSort2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+ n+" elements of the array");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        selection(arr,n);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void selection(int[] arr,int n){
        for (int i=0;i<n-1;i++){//i represent the current index
            //find minimum element at unsorted part of the array
            int minindex=i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            //swap current element with minimum element so.correct element i will now have correct element
            //arr[minindex] and arr[i]
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }
    }
}
