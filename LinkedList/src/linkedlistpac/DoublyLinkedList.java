package linkedlistpac;

public class DoublyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(15);
        Node c=new Node(25);
        Node d=new Node(35);
        Node e=new Node(45);
//        System.out.println(a.data);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

//        System.out.println(a.next);
        b.prev=a;
        c.prev=b;
        d.prev=c;
        e.prev=d;
//        System.out.println(a);
//        System.out.println(b.prev);
//        System.out.println(b);
        display(a);
        displayRev(e);
        display2(c);

    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    static void displayRev(Node tail){
        Node temp=tail;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    static void display2(Node pos){
                Node temp=pos;
                while(temp.prev!=null){
                    temp=temp.prev;
                }
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }

