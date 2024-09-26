import java.util.*;
public class MultiArray {
    public static void main(String[] args) {
//        int[][] arr=new int[3][3];
//        arr[0][0]=1;
//        arr[0][1]=2;
//        System.out.println(arr[0][0]);
//        System.out.println(arr[0][1]);
        int [][] arr={{1,2,3},
                {4,5,6},
                {7,8,9}
        };
        printArray(arr);


    }
    static void printArray(int[][]arr){
        for(int i=0;i<arr.length;i++){ //row
            for(int j=0;j<arr[i].length;j++){ //column
                System.out.println(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
