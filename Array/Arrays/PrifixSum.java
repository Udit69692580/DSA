import java.util.Scanner;

public class PrifixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        int [] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        int [] pref=prifixSum(arr);
        prifixSum(arr);
        printArray(arr);
    }
    static void prifixSum(int [] arr){
        int n= arr.length;
//        int [] pref =new int[n];
//        pref[0]=arr[0];
        for (int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];

        }
//        return pref;
    }
    static void printArray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
