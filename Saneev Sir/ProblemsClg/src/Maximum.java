import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Elements for Array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(max(arr));

    }
    static int max(int[] arr){
        int max=arr[0];

        for (int i=0;i<arr.length;i++){

            if (arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }

}
