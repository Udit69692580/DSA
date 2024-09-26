import java.util.Scanner;

public class Pascale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows");
        int n=sc.nextInt();
        int[][]ans=pasc(n);
        printArray(ans);

    }
    static int[][] pasc(int n){
        int[][] ans=new int[n][];//column size is not fixed
        for (int i=0;i<n;i++){
            ans[i] =new int[i+1];//at every row there is going to be an extra column
            ans[i][0]=ans[i][i]=1;
            for (int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;

    }
    static void printArray(int[][]arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
