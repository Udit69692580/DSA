import java.util.Scanner;
public class Bubblesortprac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size o0f the array");
        int n=sc.nextInt();
        int[] arr= new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubble(arr,n);
        for (int a:arr){
            System.out.println(a);
        }
    }
    static void bubble(int []arr,int n){
        for (int i=0;i<n-1;i++){
            boolean flag=false;
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag){
                return;
            }
        }


    }
}
