import java.util.Scanner;

public class Rotate90 {
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
        rotate(matrix,r,c);
        System.out.println("After rotation");
        printArray(matrix);
    }
    static void rotate(int[][]matrix,int r,int c){
        transpose(matrix,r,c);
        for (int i=0;i<r;i++){
            reverse(matrix[i]);
        }
    }
    static void transpose(int[][] matrix,int r,int c){
        for (int i=0;i<r;i++){
            for (int j=i;j<c;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static void reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void printArray(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
