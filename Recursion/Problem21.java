import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        printSsq(s,"");

    }
    static void printSsq(String s,String currans){
        if(s.length()==0){
            System.out.println(currans);
            return;
        }
        char curr=s.charAt(0);
        String remstr=s.substring(1);
        printSsq(remstr,currans+curr);//add curr/choose to come
        printSsq(remstr,currans);//donot add curr/does not choose to come
    }
}
