public class FirstOccurance {
    public static void main(String[] args) {
        int[] arr={1,12,12,77,81,93,105};
        int ans=firstOccur(arr,12);
        System.out.println(ans);
    }
    static int firstOccur(int[] arr,int target){
        int fo=-1;
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if (target==arr[mid]){
                fo=mid;
                end=mid-1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return fo;
    }
}
