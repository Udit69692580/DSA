import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Array elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findSum(arr,0));

    }
    static int findSum(int[]arr,int idx){
        if (idx==arr.length) return 0;
        int smallSum=findSum(arr,idx+1);
        int sum=smallSum+arr[idx];
        return sum;
    }
}
