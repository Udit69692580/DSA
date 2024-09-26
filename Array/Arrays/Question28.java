import java.util.Scanner;

public class Question28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows");
        int r =sc.nextInt();
        System.out.println("Enter the no.of column");
        int c= sc.nextInt();
        int[][]matrix =new int[r][c];
        System.out.println("Enter matrix value");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter l1");
        int l1=sc.nextInt();
        System.out.println("Enter r1");
        int r1=sc.nextInt();
        System.out.println("Enter l2");
        int l2=sc.nextInt();
        System.out.println("Enter r2");
        int r2=sc.nextInt();
        System.out.println("rectangle sum ="+sum(matrix,r,c,l1,r1,l2,r2));

    }
    static int sum(int[][]matrix,int r,int c,int l1,int r1,int l2,int r2){
        int sum=0;
        for (int i=l1;i<=l2;i++){
            for (int j=r1;j<=r2;j++){
                sum=sum+matrix[i][j];
            }
        }
        return sum;
    }
    static void printArray(int[][]arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
