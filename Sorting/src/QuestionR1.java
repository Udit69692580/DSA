import java.util.Scanner;

public class QuestionR1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        moveZeros(arr,n);
        for (int a:arr){
            System.out.println(a);
        }
    }
    static void moveZeros(int[]arr,int n){
        for (int i=0;i<n;i++){
            boolean flag=false;
            int j=i;
            for (j=0;j<n-i-1;j++){
                if (arr[j]==0 && arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if (flag==false) return;
        }
    }
}
