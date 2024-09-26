import java.util.Scanner;

public class StoreInAccending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int a:arr){
            System.out.println(a);
        }
        sort(arr);

    }
    static void sort(int[] arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }


        }
        System.out.println("The sorted array is");
        for(int b:arr){
            System.out.println(b);

        }

    }

}
