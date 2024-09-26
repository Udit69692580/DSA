package linkedlistpac;

public class InsertAtStart {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Begain{
        Node head=null;
        Node tail=null;
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
         void diaplay(){
            while(head!=null){
                System.out.print(head.data+" ");
                head=head.next;
            }
        }
    }
    public static void main(String[] args) {
//        Node a=new Node(6);
//        Node b= new Node(8);
//        Node c= new Node(12);
//        a.next=b;
//        b.next=c;
        Begain bb=new Begain();
        bb.insertBegain(23);
        bb.insertBegain(25);
        bb.insertBegain(280);
        bb.insertBegain(259);
        bb.insertBegain(1220);
        bb.insertBegain(2005);
        bb.diaplay();

    }
//    static void diaplay(Node head){
//        while(head!=null){
//            System.out.print(head.data+" ");
//            head=head.next;
//        }
//    }

}
