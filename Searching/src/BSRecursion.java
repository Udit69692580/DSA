public class BSRecursion {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,12,33,45,72};
        int ans=bsRecursion(arr,0, arr.length-1,45);
        System.out.println(ans);
    }
    static int bsRecursion(int[] arr,int start,int end,int target){
        if (start>end) return -1;
        int mid=(start+end)/2;
        if (target==arr[mid]) return mid;
        if (target<mid){
           return bsRecursion(arr,start,mid-1,target);
        }else {
            return bsRecursion(arr,mid+1,end,target);
        }
    }
}
