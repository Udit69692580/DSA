import java.util.Scanner;

public class SpiralOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows for matrix");
        int r = sc.nextInt();
        System.out.println("Enter the no.of column for matrix");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter " + r * c + " elements for the matrix ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        printArray(matrix);
        spiral(matrix,r,c);
        printArray(matrix);
    }
    static void spiral(int[][] matrix,int r,int c){
        int topRow=0,rightColumn=c-1,buttomRow=r-1,leftColumn=0;
        int totalElements=0;
        while(totalElements<r*c){
            for (int j=leftColumn;j<=rightColumn && totalElements<r*c;j++){
                System.out.println(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++; //to privent the repetation of element
            for (int i=topRow;i<=buttomRow && totalElements<r*c;i++){
                System.out.println(matrix[i][rightColumn] +" ");
                totalElements++;
            }
            rightColumn--;
            for (int j=rightColumn;j>=leftColumn && totalElements<r*c;j--){
                System.out.println(matrix[buttomRow][j] + " ");
                totalElements++;
            }
            buttomRow--;
            for (int i=buttomRow;i>=topRow && totalElements<r*c;i--){
                System.out.println(matrix[i][leftColumn]);
                totalElements++;
            }
            leftColumn++;
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
