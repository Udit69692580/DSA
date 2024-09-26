package linkedlistpac;

public class BasicOfLinkedList {
    public static class Node{
        int data;
        Node next;//address of the next node and the dataType is node
        public  Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a =new Node(2);
        Node b =new Node(3);
        Node c =new Node(4);
        Node d =new Node(5);
        Node e =new Node(6);

//        2 3 4 5
//        System.out.println(a.data);
//        System.out.println(b);//@6d03e736 this is the address of b
        a.next=b;//2-->3 4 5
//        System.out.println(a.next);
        b.next=c;//2-->3-->4 5
        c.next=d;//2-->3-->4-->5
        d.next=e;
        //Now all the data are linked with each other
//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);
        Node temp=a;
//        System.out.println(temp.data);
//        for (int i=0;i<=4;i++){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
//        if we dont know the size
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
        display(a);
        System.out.println();
        displayRev(a);//To print in reverse order


    }
    static void display(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");
        display(head.next);
    }
    static void displayRev(Node head){
        if(head==null) return;
        displayRev(head.next);
        System.out.print(head.data+" ");

    }
}
