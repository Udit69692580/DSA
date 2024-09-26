import java.util.Scanner;

public class ReAr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrAY");
        int n =sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverseArray(arr);
        System.out.println("After reverse");
        printArray(arr);
    }
    static void reverseArray(int [] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            swapArray(arr,i,j);
            i++;
            j--;

        }
    }
    static void swapArray(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println(" ");
    }
}
