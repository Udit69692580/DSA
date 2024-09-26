import java.util.*;

public class SecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrAY");
        int n =sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array is");
        for(int a:arr){
            System.out.println(a);
        }
        System.out.println("The maximum value is :"+maxValue(arr));
        System.out.println("The second maximum value is :"+secondMax(arr));

    }
    static int maxValue(int[] arr){
        int mx= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx= arr[i];
            }
        }
        return mx;
    }
    static int secondMax(int[] arr){
        int n=arr.length;
        int mx=maxValue(arr);
        for(int i=0;i<n;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax=maxValue(arr);
        return secondMax;
    }
}
