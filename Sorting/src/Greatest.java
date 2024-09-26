
import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array");
//        int n=sc.nextInt();
        int [] arr=new int[3];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The greatest number is:"+findGreatest(arr,0));
    }
    static int findGreatest(int[] arr,int idx){
        if(idx>arr.length-1) return idx;
        int ans=findGreatest(arr,idx+1);
        if (ans>arr[idx]){
            return ans;
        }else{
            return arr[idx];
        }
    }
}
