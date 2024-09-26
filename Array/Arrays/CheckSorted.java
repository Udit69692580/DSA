import java.util.*;
public class CheckSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(checksort(arr));
    }

    static boolean checksort(int[] arr) {
        boolean check =true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<arr[i-1]) {
                check =false;
                break;
            }
//
        }
        return check;
    }
}
