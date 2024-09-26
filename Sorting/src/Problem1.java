public class Problem1 {
    public static void main(String[] args) {
        int[] arr={3,8,6,7,5,9,10};
//        int[] arr={7};
        System.out.println("Array before Sortng");
        printArray(arr);
        System.out.println("Array after sorting");
        sort(arr);
        printArray(arr);
    }
    static void sort(int[] arr){
        if (arr.length<=1) return;
        int x=-1;
        int y=-1;
        for (int i=1;i< arr.length;i++){
            if (arr[i-1]>arr[i]){
                if (x==-1){
                    x=i-1;
                    y=i;
                }else{
                    y=i;
                }
            }
        }
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;

    }
    static void printArray(int[] arr){
        for (int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
}
