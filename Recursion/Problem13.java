import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size of an array");
        int n = sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxValue(arr,0));

    }
    static int maxValue(int[] arr,int idx){
        if (idx==arr.length-1){
            return arr[idx];
        }
        int small=maxValue(arr,idx+1);
        if (small>arr[idx]){
            return small;
        }else{
            return arr[idx];
        }
    }
}
