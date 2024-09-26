import java.util.Scanner;

public class ReverseInPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int a:arr){
            System.out.println(a);
        }
        reverse(arr);
        printArray(arr);
    }
    static void reverse(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            swapArray(arr,i,j);
            i++;
            j--;
        }
    }
    static void swapArray(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print(" ");
    }
}
