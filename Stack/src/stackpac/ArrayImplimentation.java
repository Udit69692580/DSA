package stackpac;

public class ArrayImplimentation {
    public static class Stack{
        private int[] arr=new int[5];
        private int idx=0;
        void push(int x){
            if (isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[idx]=x;
            idx++;
        }
        int peak(){
            if (idx==0){
                System.out.println("stack is empty");
                return -1;
            }else{
                return arr[idx-1];
            }
        }
        int pop(){
            if (idx==0) {
                System.out.println("stack is empty");
                return -1;
            }else {
                int top=idx-1;
                arr[idx-1]=0;
                idx--;
                return top;
            }
        }
        void display(){
            for (int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if (idx==0){
                return true;
            }else return false;
        }
        boolean isFull(){
            if (idx==arr.length){
                return true;
            }else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Stack st= new Stack();
        st.push(12);
        st.push(15);
        st.push(25);

        st.push(45);
        st.push(35);
//        st.pop();


        st.display();
        System.out.println(st.peak());
//        st.peak();
//        st.pop();
//        st.display();
//        System.out.println(st.size());
        st.push(200);
    }
}
