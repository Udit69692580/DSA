import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Elements for Array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sum(arr,n));

//        System.out.println("Enter the no.of large number");
//        int l=sc.nextInt();
    }
    static int sum(int[] arr,int n){
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
        int sum=0;
        for (int i=1;i<arr.length;i++) {
            sum += arr[i];
        }
        return sum;
    }

}
