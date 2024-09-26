package linkedlistpac;

public class Implimentation {
    public static class Node{
        int data;
        Node next;
         Node(int data){
            this.data=data;
        }
    }
    public static class Linkedlist{
       static Node head=null;
        Node tail=null;
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if (head==null){
                head=temp;
                tail=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
        }
        void insertBegain(int val){
            Node newNode=new Node(val);
            if (head==null){
                head=newNode;
                tail=newNode;
            }else{

                newNode.next=head;
                head=newNode;

            }
        }
        void insertAtany(int pos,int val){
            if (pos==length()) {
                insertAtEnd(val);
                return;
            } else if (pos==0) {
                insertBegain(val);
                return;
            }
            Node newNode=new Node(val);
            Node temp=head;
            for (int i=1;i<pos;i++){
                temp=temp.next;
                newNode.next=temp.next;
                temp.next=newNode;
            }
        }
        public static int length(){
        Node temp=head;
            int count=0;
            while(temp!=null){
//            System.out.println(temp.next);
                count++;
                temp=temp.next;
            }
            return count;
        }
         int getData(int pos){
            Node temp=head;
            for (int i=1;i<=pos;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void deleteAtAny(int pos){
            if (pos==0){
                head=head.next;
                return;
            }
            Node temp=head;
            for (int i=1;i<pos;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            if (pos==length()){
                tail=temp;
            }

        }
        void display(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.insertAtEnd(2);
        ll.insertAtEnd(5);

//        ll.display();
        System.out.println();
        ll.insertBegain(2005);
//        ll.display();
        ll.insertAtEnd(2401);
//        ll.display();
        ll.insertAtany(2,12);
//        ll.display();
        ll.insertAtany(5,222);
//        ll.display();
        ll.insertAtany(0,122);
        ll.display();
//
//        System.out.println(ll.getData(6));
        ll.deleteAtAny(4);
        ll.display();
        System.out.println("Head is:"+ll.head.data);
        System.out.println("Tail is:"+ll.tail.data);

    }
}
