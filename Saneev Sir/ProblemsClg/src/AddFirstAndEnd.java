import java.util.Scanner;

class AddFirstAndEnd
{
    public static void main (String[] args)
    {
        // your code goes here
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        int[] array=new int[N+2];
        for(int i=1;i<=N;i++){
            array[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        array[0]=x;
        array[N+1]=x;
        for(int i=0;i<N+2;i++){
            System.out.print(array[i]+" ");
        }

    }
}
