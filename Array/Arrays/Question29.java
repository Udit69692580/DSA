import java.util.Scanner;

public class Question29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows");
        int r =sc.nextInt();
        System.out.println("Enter the no.of column");
        int c= sc.nextInt();
        int[][]matrix =new int[r][c];
        System.out.println("Enter " + r*c +"matrix value");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
    }
        System.out.println(" enter rectangle boundris l1 r1 l2 r2");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();

        System.out.println("The sum is:"+findSm(matrix,l1,r1,l2,r2));
}
static int findSm(int[][] matrix,int l1,int r1,int l2,int r2){
        int sum =0;
        prifixSum(matrix);
        for (int i=l1;i<=l2;i++){
            if(r1>=1){
                sum+=matrix[i][r2]-matrix[r1][r1-1];
            }else{
                sum+=matrix[i][r2];
            }
        }
        return sum;
}
static void prifixSum(int[][]matrix){
        int r=matrix.length;
        int c= matrix[0].length;
        for (int i=0;i<r;i++){
            for (int j=1;j<c;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }
}
}