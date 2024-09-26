import java.util.Scanner;

public class LastRepeation {
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
        System.out.println("The last repeation is :"+lastRepeateValue(arr));
    }
    static int lastRepeateValue(int[]arr){
        int n= arr.length;
        int ans=0;
        for(int i=n-1;i>0;i--){
            for(int j=i-1;j>0;j--){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
