package stackpac;

import java.util.Scanner;
import java.util.Stack;

public class DisplayansReverseRecursively {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
//        st.push(20);
//        st.push(30);
//        st.push(40);
//        st.push(50);
//        st.push(60);
        System.out.println("Enter the size:");
        int n=sc.nextInt();
        System.out.println("Enter the element to be insret");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        reverse(st);
//        System.out.println(st);

    }
    static void reverse(Stack<Integer> st){
        while(st.size()==0) return;
        int top=st.pop();
        System.out.print(top+" ");
        reverse(st);
        st.push(top);
    }
}
