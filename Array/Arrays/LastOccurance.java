import java.util.*;
public class LastOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Entar x");
        int x=sc.nextInt();
        System.out.println(arrayOccurance(arr,x));
    }
    static int arrayOccurance(int[] arr, int x) {

        int last=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                last=i;
            }
        }
        return last;
    }
}
