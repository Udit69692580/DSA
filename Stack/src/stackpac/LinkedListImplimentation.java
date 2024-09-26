package stackpac;

public class LinkedListImplimentation {
    public static class Node{//User defined datatype
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LlStack{
        Node head=null;
       private int size=0;
        void push(int x){
            Node temp= new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        int pop(){
            if (head==null){
                System.out.println("Stack is empty");
                return -1;
            }else{
                int x=head.data;
                head=head.next;
                size--;
                return x;
            }
        }
        int peak(){
            if (head==null) {
                System.out.println("Stack is empty");
                return -1;
            }else{
                return head.data;
            }
        }
        boolean isEmpty(){
            if (size==0){
                return true;
            }else {
                return false;
            }
        }
        int size(){
            return size;
        }
        void displayrec(Node head){
            if (head==null) return;
            displayrec(head.next);
            System.out.print(head.data+" ");
        }
        void display(){
            displayrec(head);
            System.out.println();
        }
        void displayrev(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        LlStack l = new LlStack();
        l.push(20);
        l.push(25);
        l.push(30);
        l.push(40);
        l.push(50);
        l.display();
        System.out.println(l.peak());
        l.pop();
        l.displayrev();
        l.display();
        l.peak();
        System.out.println(l.size());
    }
}
