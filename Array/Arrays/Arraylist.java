import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        //Wrapper class
//        Integer i=Integer.valueOf(5);
//        System.out.println(i);
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        //To get an element at index i
        System.out.println(l1.get(1));
        //print with for loop
        for (int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        //Print the arrayList directly
        System.out.println(l1);
        //Adding element at index i
        l1.add(1,100);
        System.out.println(l1);
        //Modifying element at index i
        l1.set(1,10);
        System.out.println(l1);
        //Removing element at index i
        l1.remove(1);
        System.out.println(l1);
        //remove an element
        System.out.println(l1.remove(Integer.valueOf(7)));
        System.out.println(l1);
        //check if an element exist
        boolean ans = l1.contains(Integer.valueOf(7));
        System.out.println(ans);
        //if we do not specify any class we can add what ever element we wants
        ArrayList l= new ArrayList();
        l.add("Udit");
        l.add(9);
        l.add(true);
        l.add(2.9);
        System.out.println(l);


    }
}
