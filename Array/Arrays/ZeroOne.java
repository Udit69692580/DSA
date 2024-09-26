import java.util.Scanner;

public class ZeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrAY");
        int n =sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        zeroOne(arr);
        printArray(arr);

    }
    static void zeroOne(int[]arr){
        int n= arr.length;
        int count=0;
        for (int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0;i<count;i++){
            arr[i]=0;
        }
        for (int i=count+1;i<n;i++){
            arr[i]=1;
        }
    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println(" ");
    }
}
