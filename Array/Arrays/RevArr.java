import java.util.Scanner;

public class RevArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrAY");
        int n =sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int [] ans=reverse(arr);
        printArray(ans);
    }
    static int[] reverse(int[]arr){
        int n= arr.length;
        int[] ans=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            ans[j]=arr[i];
            j++;
        }
        return ans;
    }
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println(" ");
    }
}
