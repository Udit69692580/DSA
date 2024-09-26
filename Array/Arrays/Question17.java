import java.util.*;
public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter"+n+"Array element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        evenOdd(arr);
        System.out.println("Array after operation");
        printArray(arr);
    }
    static void evenOdd(int[] arr){
        int n=arr.length;
        int start=0,end=n-1;
        while(start<end){
            if(arr[start]%2==1&&arr[end]%2==0){
                swap(arr,start,end);
                start++;
                end--;

            }
            if(arr[start]%2==0){
                start++;
            }
            if(arr[end]%2==1){
                end--;
            }
        }
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(" ");
    }
}
