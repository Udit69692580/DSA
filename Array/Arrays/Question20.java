import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        int [] arr=new int[n+1];
        for (int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        prifixSum(arr);
        System.out.println("Enter no.of queries");
        int q= sc.nextInt();
        while (q-->0){
            System.out.println("Enter range");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans= arr[r]-arr[l-1];
            System.out.println(ans);
        }
    }
    static void prifixSum(int [] arr){
        int n= arr.length;
//        int [] pref =new int[n];
//        pref[0]=arr[0];
        for (int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];

        }
//        return pref;
    }
}
