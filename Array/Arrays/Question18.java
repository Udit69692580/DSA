import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter"+n+"Array element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int []ans=nonDecreasing(arr);
        printArray(ans);
    }
    static int[] nonDecreasing(int[] arr){
        int n=arr.length;
        int start=0,end=n-1;
        int [] ans=new int[n];
        int k=0;
        while(start<=end){
            if (Math.abs(arr[start])>Math.abs(arr[end])){
                ans[k++]=arr[start]*arr[start];
                start++;
            }else{
                ans[k++]=arr[end]*arr[end];
                end--;
            }
        }
        reverse(ans);
        return ans;
    }
    static void reverse(int [] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            swapArray(arr,i,j);
            i++;
            j--;        }
    }

    static void swapArray(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(" ");
    }
}
