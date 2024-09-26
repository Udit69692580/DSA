package stackpac;
import java.util.Stack;
public class InsertAtButtom {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(2);
        st.push(7);
        st.push(12);
        st.push(250);
        st.push(241);
        System.out.println(st);
        Stack<Integer> st2=new Stack<>();

        while(st.size()>2){//Insert at any position
            st2.push(st.pop());
        }
        st.push(21);
        while(st2.size()>0){
            st.push(st2.pop());
        }
        System.out.println(st);
        System.out.println(st.peek());
    }
}
