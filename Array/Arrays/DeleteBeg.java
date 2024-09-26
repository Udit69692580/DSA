package Arrays;

import java.util.Scanner;

public class DeleteBeg {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter "+ n +" Elements");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
//        System.out.println("enter element to be deleted");
//        int del=sc.nextInt();
        int ans=delete(arr,n);
        System.out.println(ans);
        printArray(arr,n);
    }
    static int delete(int[] arr,int n){
        if (n==0){
            System.out.println("Empty");
            return n;
        }
//        for (int i=0;i<arr.length-1;i++){
//            arr[i]=arr[i+1];
//        }
        return n-1;
    }
    static void printArray(int[] arr,int n){
        for(int i=0;i< n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
