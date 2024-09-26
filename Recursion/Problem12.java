import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printArray(arr,0);

    }
    static void printArray(int[]arr,int idx){
        if (idx==arr.length){
            return;
        }
        printArray(arr,idx+1);
        
        System.out.print(arr[idx]);

    }
}
