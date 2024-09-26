public class InplimentationUsingArray {
    public static class QueueArr{
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr= new int[100];
        void add(int val){
            if (r==arr.length){
                System.out.println("Queue is full:");
                return;
            }
            if (f==-1){
                f=r=0;
                arr[0]=val;
//                r++;
            }
            else{
                arr[r+1]=val;
                r++;
            }
            size++;
        }
        int remove(){
            if (size==0) {
                System.out.println("Empty");
                return -1;
            }
            int x= f;
            f++;
            size--;
            return x;
        }
        int peek(){

            return arr[f];
        }
        void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            } else {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        QueueArr qq=new QueueArr();
        qq.display();
        qq.add(20);
        qq.add(30);
        qq.add(40);
        qq.add(50);
        qq.display();
        qq.remove();
        qq.display();
        System.out.println(qq.peek());
    }
}
