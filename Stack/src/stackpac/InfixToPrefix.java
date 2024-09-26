package stackpac;

import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String infix="9-(5+3)*4/6";
        System.out.println(infix);
        Stack<String> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        for (int i=0;i<infix.length();i++) {
            char ch = infix.charAt(i);//ch=5
            int ascii = (int) ch;//ascii=53
            //0-->48 and 9-->57
            if (ascii >= 48 && ascii <= 57) {
                //0 to 9
                String s=""+ch;
                val.push(s);
            } else if (op.size() == 0 || ch=='(' || op.peek()=='(') {
                op.push(ch);
            } else if (ch==')') {
                while (op.peek()!='('){
                    String v2 = val.pop();
                    String v1 = val.pop();
                  char o = op.pop();
                  String t=o+v1+v2;
                  val.push(t);
                }
                op.pop();

            } else {
                if (ch == '+' || ch == '-') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t=o+v1+v2;
                    val.push(t);
//                    op.pop();
                    op.push(ch);

                }
                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t=o+v1+v2;
                        val.push(t);
//                        op.pop();
                        op.push(ch);
                    } else op.push(ch);

                }
            }
        }

        //val stack size 1
        while (val.size() > 1) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t=o+v1+v2;
            val.push(t);
        }
        String prifix=val.pop();
        System.out.println(prifix);
    }
}
