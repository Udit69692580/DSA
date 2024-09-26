import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows for matrix a");
        int r1=sc.nextInt();
        System.out.println("Enter the no.of column for matrix a");
        int c1=sc.nextInt();
        int[][] a=new int[r1][c1];
        System.out.println("Enter "+r1*c1 +" elements");
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        printArray(a);
        System.out.println("Enter the no.of rows for matrix b");
        int r2=sc.nextInt();
        System.out.println("Enter the no.of column for matrix b");
        int c2=sc.nextInt();
        int[][] b=new int[r2][c2];
        System.out.println("Enter "+r2*c2 +" elements");
        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        printArray(b);
        System.out.println("The resultant matrix is :");
        sumArray(a,r1,c1,b,r2,c2);

    }
    static void sumArray(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
        if(r1!=r2||c1!=c2){
            System.out.println("Wrong input");
            return;
        }
        int [][] sum=new int[r1][c1];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        printArray(sum);
    }
    static void printArray(int[][]arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
