package Arrays;

import java.util.Scanner;

public class InsertPos {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n= sc.nextInt();
        int[] arr= new int[n+1];
        System.out.println("Enter "+ n +" Elements");
        for (int i=0;i<arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be inserted:");
        int target=sc.nextInt();
        System.out.println("Enter the position:");
        int pos=sc.nextInt();
        insert(arr,pos,target);
//        deleteBeg(arr,target);
        printArray(arr);
    }
    static void insert(int [] arr,int pos,int target){
        int n=arr.length-1;
        for (int i=n;i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=target;
    }
    static void deleteBeg(int[]arr,int target){
        int n=arr.length-1;
        for (int i=0;i<n;i++){
            arr[i]=arr[i+1];
        }
    }
    static void printArray(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
