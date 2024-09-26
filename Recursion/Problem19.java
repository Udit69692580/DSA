import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String rev =pelindrom(s,0);
        if(rev.equals(s)){
            System.out.printf("%s is Pelindrom",s);
        }else{
            System.out.printf("%s is Not pelindrom",s);
        }
    }
    static String pelindrom(String s,int idx){
        if(idx==s.length()) return "";
        String smalans=pelindrom(s,idx+1);
        return smalans+s.charAt(idx);
    }
}
