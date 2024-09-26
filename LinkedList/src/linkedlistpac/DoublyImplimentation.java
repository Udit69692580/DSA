package linkedlistpac;

public class DoublyImplimentation {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }
    public static class Dll{
      static Node head=null;
        static Node tail=null;
        static void insertAtBegin(int val){
            Node newNode=new Node(val);
            if (head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                Node temp=head;
                newNode.next=temp;
                temp.prev=newNode;
                head=newNode;
            }
        }
        void insertAtEnd(int val){
            Node newNode=new Node(val);
            if (head==null){
                head=newNode;
                tail=newNode;
            }
            else {
                tail.next=newNode;
                newNode.prev=tail;
                tail=newNode;
            }
        }
        void insertATAnyPos(int pos,int val){
            Node newNode=new Node(val);
            if (pos==0){
                insertAtBegin(val);
                return;
            }else {
                Node temp=head;
                for (int i=1;i<pos;i++){
                    temp=temp.next;

                }
                temp.next.prev=newNode;
                newNode.prev=temp;
                newNode.next=temp.next;
                temp.next=newNode;

            }
        }
        void deleteAtBegain(){
            head=head.next;
            head.prev=null;

        }
        void deleteAtEnd1(){
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp=temp.prev;
            temp.next=null;
        }
        void deleteAtEnd2(){
            Node temp=tail;
            temp=temp.prev;
            temp.next=null;
            tail=temp;
        }
        void deleteAtAnyPos(int pos){
            Node temp=head;
            for (int i=1;i<pos;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.next.prev=temp;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Dll d=new Dll();
        d.insertAtBegin(20);
        d.insertAtBegin(250);
        d.insertAtBegin(210);
        d.insertAtBegin(110);
        d.display();
        d.insertAtBegin(510);
        d.display();
        d.insertAtEnd(2555);
        d.display();
        d.insertATAnyPos(3,45);
        d.deleteAtBegain();
        d.display();
        System.out.println(d.head.data);
//        d.deleteAtEnd1();
//        d.display();
        d.deleteAtEnd2();
        d.display();
        d.deleteAtEnd1();
        d.display();
        d.deleteAtAnyPos(2);
        d.display();



    }
}
