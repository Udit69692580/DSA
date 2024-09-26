public class MergeSort {
    public static void main(String[] args) {
        int[] arr={13,2,7,5,4};
        int n=arr.length;
        System.out.println("Array before sorting:");
        printArray(arr);
        mergesort(arr,0,n-1);
        System.out.println("Array after sorting:");
        printArray(arr);
    }
    static void mergesort(int[] arr,int l,int r){
        if (l>=r) return;
        int mid=(l+r)/2;
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    static void merge(int[] arr,int l,int mid,int r){
        int n1=mid-l+1;//size of left array
        int n2=r-mid;//size of right array
        int[] left=new int[n1];
        int[] right=new int[n2];
        int i,j,k;
        for (i=0;i<n1;i++) left[i]=arr[l+i];//[13,2,7]
        for (j=0;j<n2;j++) right[j]=arr[mid+1+j];//[5,4]
        i=0;
        j=0;
        k=l;
        while(i<n1&&j<n2){
            if (left[i]<=right[j]){
                arr[k]=left[i];
                k++;
                i++;
            }else{
                arr[k]=right[j];
                k++;
                j++;
            }
        }
        while(i<n1){
            arr[k]=left[i];
            k++;
            i++;
        }
        while(j<n2){
            arr[k]=right[j];
            k++;
            j++;
        }

    }
    static void printArray(int[] arr){
        for (int res:arr){
            System.out.print(res+" ");
        }
        System.out.println();
    }
}
