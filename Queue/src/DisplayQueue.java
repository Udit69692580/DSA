import java.util.LinkedList;
import java.util.Queue;

public class DisplayQueue {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        System.out.println(q);
        Queue<Integer> q2=new LinkedList<>();
        while (q.size()>0){
            int r=q.remove();
            System.out.print(r+" ");
            q2.add(r);
        }
        System.out.println();
        while (q2.size()>0){
            q.add(q2.remove());
        }
        System.out.println(q);

    }
}
