package linkedlistpac;

public class FindLength {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
       Node a= new Node(2);
       Node b= new Node(3);
       Node c= new Node(4);
       Node d= new Node(5);
       Node e= new Node(6);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(length(a));
    }
    public static int length(Node head){
//        Node temp=a;
        int count=0;
        while(head!=null){
//            System.out.println(temp.next);
            count++;
            head=head.next;
        }
        return count;
    }
}
