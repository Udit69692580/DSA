import java.util.*;
public class SmallestAndBigest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int []arr =new int[n];
        System.out.println("Enter the element of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array is :");
//        for(int a:arr){
//            System.out.println(a);
//        }
        Arrays.sort(arr);
        System.out.println("The smallest element is:"+smallestElement(arr));
        System.out.println("The largest element is:"+largestElement(arr));

    }
    static int smallestElement(int[] arr){
       int smallest =-1;
        for(int i=0;i<arr.length;i++){
            smallest=arr[0];
        }
        return smallest;
    }
    static int largestElement(int[] arr){
        int largest=-1;
        for(int i=0;i<arr.length;i++){
            largest=arr[arr.length-1];
        }
        return largest;
    }

    }

