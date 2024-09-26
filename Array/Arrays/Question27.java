import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        int[][] matrix=spiral(n);
        printArray(matrix);
    }
    static int[][]spiral(int n){
        int[][]matrix=new int[n][n];
        int topRow=0,rightColumn=n-1,buttomRow=n-1,leftColumn=0;
        int count=1;
        while(count<=n*n){
            for (int j=leftColumn;j<=rightColumn && count<=n*n;j++){
                matrix[topRow][j]=count;
                count++;
            }
            topRow++;
            for (int i=topRow;i<=buttomRow && count<=n*n;i++){
                matrix[i][rightColumn]=count;
                count++;
            }
            rightColumn--;
            for (int j=rightColumn;j>=leftColumn && count<=n*n ;j--){
                matrix[buttomRow][j]=count;
                count++;
            }
            buttomRow--;
            for (int i=buttomRow;i>=topRow && count<=n*n;i--){
                matrix[i][leftColumn]=count;
                count++;
            }
            leftColumn++;
        }
        return matrix;
    }
    static void printArray(int[][]matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println(" ");
        }
    }
}
