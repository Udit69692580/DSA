package Arrays;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.ensureCapacity(10);
//        int c=l1.ensureCapacity();


//        System.out.println(s);
        l1.add(20);
        l1.add(20);
        l1.add(20);
        l1.add(20);
        l1.add(20);
        l1.add(20);
        l1.add(20);
        l1.add(20);
        l1.add(20);
        l1.add(20);
//        System.out.println(c);

        l1.add(20);
        System.out.println(l1.size());

    }
}
