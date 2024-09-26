package Arrays;

import java.util.Scanner;

public class InsertEnd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter "+ n +" Elements");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be inserted:");
        int target=sc.nextInt();
        insert(arr,target);
        printArray(arr);
    }
    static void insert(int[] arr,int target){
        int n= arr.length-1;
        arr[n]=target;
    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
