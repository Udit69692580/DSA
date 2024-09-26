import java.util.*;
public class SheloArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int [] arr =new int[n];
//        int [] arr1 = int[]arr;

        inputArray(arr,sc);
        changeArray(arr);
        printArray(arr);
    }
    static void inputArray(int[] arr,Scanner sc){
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    static void printArray(int[] arr){
        for(int a:arr){
            System.out.println(a);
        }
    }
    static void changeArray(int []arr){
//        int [] arr1=int[]arr;
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
//            System.out.println(arr[i]);
        }
    }
}
