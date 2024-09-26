import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter"+n+"Element");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        if (findElement(arr,target,0)){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
    static boolean findElement(int[] arr,int target,int idx){
        if (idx==arr.length){
            return false;
        }
        if (arr[idx]==target) return true;
           if( findElement(arr,target,idx+1)){
            return true;
        }else{
            return false;
        }
    }
}
