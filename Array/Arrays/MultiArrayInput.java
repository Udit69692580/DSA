import java.util.*;
public class MultiArrayInput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no.of row");
        int r=sc.nextInt();
        System.out.println("Enter column");
        int c=sc.nextInt();
        int arr [][]=new int[r][c];
        System.out.println("Enter"+r*c+"Elements");
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        printArray(arr);
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
