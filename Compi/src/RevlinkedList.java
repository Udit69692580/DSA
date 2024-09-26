import java.util.LinkedList;
import java.util.Scanner;

public class RevlinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll= new LinkedList<>();
        ll.add(25);
        ll.add(32);
        ll.add(58);
        ll.add(217);
        System.out.println(ll);
        Node a = new Node(20);
        Node b = new Node(30);
        Node c = new Node(40);
        Node d = new Node(50);
        Node e = new Node(60);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);



    }
    static void display(Node head){
        if(head==null) return;
        display(head.next);
        System.out.print(head.data+" ");
    }
}
