package stackpac;

import java.util.Stack;
import java.util.Scanner;

public class MoveStackToAnathorStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
//        System.out.println("Enter the size of the stack:");
//        int n=sc.nextInt();
//        System.out.println("Enter the elements u want to insert:");
//        for (int i=0;i<n;i++){
//            int x=sc.nextInt();
//            st.push(x);
//        }
//        System.out.println(st);
        st.push(2);
        st.push(7);
        st.push(12);
        st.push(250);
        st.push(241);
        System.out.println(st);
        Stack<Integer> st2=new Stack<>();
        //To print the stack in reverse
        while(st.size()>0){
            int p=st.peek();
            st2.push(p);
            st.pop();
        }
        System.out.println(st2);

        Stack<Integer> st3=new Stack<>();
        while(st2.size()>0){
            st3.push(st2.pop());
        }
        System.out.println(st3);
    }
}
