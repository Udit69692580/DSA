import java.util.Scanner;

public class Pellindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String anss=peli(a,0);
        System.out.println(anss);
        if (anss.equals(a)){
            System.out.printf("%s is pelindrom",a);
        }else{
            System.out.printf("%s is not",a);
        }
    }
    static String peli(String a,int idx){
        if(idx==a.length()) return "";
        String sans=peli(a,idx+1);
        return sans+a.charAt(idx);
    }
}
