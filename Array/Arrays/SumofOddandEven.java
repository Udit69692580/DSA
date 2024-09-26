import java.util.Scanner;

public class SumofOddandEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The sum of all the odd numbers is:"+sumOfOdd(arr));
        System.out.println("The mul of all the even numbers is:"+mulOfEven(arr));
    }
    static int sumOfOdd(int[]arr){
        int res =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                res= res+arr[i];

            }
        }
        return res;
    }
    static int mulOfEven(int[]arr){
        int res1=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                res1= res1*arr[i];

            }
        }
        return res1;

    }

}
