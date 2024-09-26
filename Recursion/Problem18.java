import java.util.Scanner;

//import static jdk.internal.org.jline.utils.Colors.s;

public class Problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s, 0));


    }

    static String reverse(String s, int idx) {
        if (idx == s.length()) return " ";
        String smalans = reverse(s, idx + 1);
//        char curr = s.charAt(idx);
//        String ans = smalans + curr;


        return smalans + s.charAt(idx);

    }
}

