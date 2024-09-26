import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows for matrix");
        int r=sc.nextInt();
        System.out.println("Enter the no.of column for matrix");
        int c=sc.nextInt();
        int [][] matrix=new int[r][c];
        System.out.println("Enter "+ r*c +" elements for the matrix ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        printArray(matrix);
        transposeInplace(matrix,r,c);
        System.out.println("After transpose");
        printArray(matrix);

//        int[][] ans=transpose(matrix,r,c);
//        printArray(ans);
    }
//    static int[][] transpose(int[][] matrix,int r,int c){
//        int[][] ans=new int[c][r];
//        for (int i=0;i<c;i++){
//            for (int j=0;j<r;j++){
//                ans[i][j]=matrix[j][i];
//            }
//        }
//        return ans;
//    }
    static void transposeInplace(int[][] matrix,int r,int c){//This is only possible for squre matrix
        for (int i=0;i<r;i++){
            for (int j=i;j<c;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static void printArray(int[][]matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
