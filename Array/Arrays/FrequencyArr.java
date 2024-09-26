import java.util.Scanner;

public class FrequencyArr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int [] freq=frequencyArray(arr);
        System.out.println("Enter no.of queries");
        int q= sc.nextInt();
        while(q>0){
            System.out.println("Enter no to be search");
            int x=sc.nextInt();
            if(freq[x]>0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
            q--;
        }

    }
    static int[] frequencyArray(int [] arr){
        int [] freq=new int[100001];
        for (int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
}
