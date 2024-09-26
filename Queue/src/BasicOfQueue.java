import java.util.LinkedList;
import java.util.Queue;

public class BasicOfQueue {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        System.out.println(q);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q);
        System.out.println(q.peek());

    }
}
