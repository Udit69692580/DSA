import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter"+n+"Element");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target");
        int target=sc.nextInt();
        printAllIndices(arr,target,0);

    }
    static void printAllIndices(int[] arr,int target,int idx){
        if (idx==arr.length) return;
        if (arr[idx]==target){
            System.out.println(idx);
        }

            printAllIndices(arr,target,idx+1);

        }
    }

