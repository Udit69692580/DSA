import java.util.ArrayList;
import java.util.Collections;
public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(5);
        l1.add(9);
        l1.add(7);
        l1.add(8);
        System.out.println(l1);
//        reverseList(l1);
        Collections.reverse(l1);
        System.out.println("Reversed list is "+l1);
        Collections.sort(l1);
        System.out.println("Accending order "+l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("Decending order "+l1);
        ArrayList<String> l2 =new ArrayList<>();
        l2.add("Welcome ");
        l2.add("To");
        l2.add("My ");
        l2.add("World");
        System.out.println(l2);
        Collections.sort(l2);
        System.out.println("Sorted "+l2);
    }
    static void reverseList(ArrayList<Integer> l1){
        int i=0,j=l1.size()-1;
        while(i<j){
            Integer temp=Integer.valueOf(l1.get(i));
            l1.set(i,l1.get(j));
            l1.set(j,temp);
            i++;
            j--;
            //instede of doing all these shit we can use collections class
        }
    }
}
