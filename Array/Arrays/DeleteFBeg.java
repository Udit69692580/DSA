package Arrays;

import java.util.Scanner;

public class DeleteFBeg {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter "+ n +" Elements");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
//        deleteb(arr);
//        delend(arr,n);
        deleteAny(arr,1,n);
        printArray(arr);
    }
    static void deleteb(int[] arr){
        int n=arr.length-1;
        if (n==0){
            System.out.println("array is empty");
            return;
        }
        for (int i=0;i<arr.length;i++){
            arr[i]=arr[i+1];
        }
    }
    static void delend(int []arr,int n){
        n--;
    }
    static void printArray(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void deleteAny(int[] arr,int pos,int n){
        for (int i=pos;i<n-1;i++){
//            int x=arr[pos];
            arr[i]=arr[i+1];
        }
        n--;

    }
}
