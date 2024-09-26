

public class Test {
    public static void main(String[] args) {
        String s="He l lo";
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==' '){
                break;
            }
            System.out.print(s.charAt(i));
        }
    }
}
