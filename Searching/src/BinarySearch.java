public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,12,33,45,72};
        int target=12;
        int ans=search(arr,target);
        System.out.println(ans);

    }
    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if (target==arr[mid]){
                return mid;
            } else if (target<arr[mid]) {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
