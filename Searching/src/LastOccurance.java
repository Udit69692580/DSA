public class LastOccurance {
    public static void main(String[] args) {
        int[] arr={1,2,5,12,22,22,22,23,25};
        int ans=lastOccur(arr,22);
        System.out.println(ans);
    }
    static int lastOccur(int[] arr,int target){
        int lo=-1;
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (target==arr[mid]){
                lo=mid;
                start=mid+1;
            }else if(target<arr[mid]){
                end=end-1;
            }else{
                start=mid+1;
            }
        }
        return lo;
    }
}
