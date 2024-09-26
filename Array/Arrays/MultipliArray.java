import java.util.Scanner;

public class MultipliArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of rows for matrix a");
        int r1= sc.nextInt();
        System.out.println("Enter no.of column for matrix a");
        int c1= sc.nextInt();
        int[][] a=new int[r1][c1];
        System.out.println("Enter "+ r1*c1 +" Elements");
        for (int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter no.of rows for matrix b");
        int r2= sc.nextInt();
        System.out.println("Enter no.of column for matrix b");
        int c2= sc.nextInt();
        int[][] b=new int[r2][c2];
        System.out.println("Enter "+ r2*c2 +" Elements");
        for (int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        mulArray(a,r1,c1,b,r2,c2);


    }
    static void mulArray(int[][]a,int r1,int c1,int[][]b,int r2,int c2){
        if(c1!=r2){
            System.out.println("invalide");
            return;
        }
        int[][] mul=new int[r1][c2];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c2;j++){
                for (int k=0;k<c1;k++){//This k is to travers r2 of A and c1 of B
                    mul[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Multiplication of matrices:");
        printArray(mul);
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
