package stackpac;

import java.util.Stack;

public class BasicOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(2);//To insert Element
        st.push(7);
        st.push(12);
        st.push(250);
        st.push(241);
//        System.out.println(st.peek());
        st.pop();//To delete the last inserted element
        System.out.println(st);
//        System.out.println("size is:"+st.size());
        while(st.size()>1){
            st.pop();
        }
        System.out.println("size is:"+st.peek());
        System.out.println(st);


    }
}
