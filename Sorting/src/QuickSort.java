import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr={7,13,8,5,10,2,4};
        System.out.println("Array before sorting:");
        printArray(arr);
        quick(arr,0,arr.length-1);
        System.out.println("Array after sorting");
        printArray(arr);
    }
    static void quick(int[] arr,int start,int end){
        if (start>=end) return;
        int pivot=partition(arr,start,end);
        quick(arr,start,pivot-1);
        quick(arr,pivot+1,end);
    }
    static int partition(int[] arr,int start,int end) {
        int pivotElement = arr[start];
        int count = 0;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] <= pivotElement) {
                count++;
            }
        }
            int pivotIndex = start + count;
            swap(arr,start, pivotIndex);

            int i=start,j=end;
            while (i < pivotIndex && j > pivotIndex) {
                while (arr[i] <= pivotElement) {
                    i++;
                }
                while (arr[j] > pivotElement) {
                    j--;
                }
                if (i < pivotIndex && j > pivotIndex) {
                    swap(arr,i, j);
                    i++;
                    j--;
                }
            }

        return pivotIndex;
    }
    static void printArray(int[] arr){
        for (int ans:arr){
            System.out.print(ans+" ");
        }
        System.out.println();
    }
    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
