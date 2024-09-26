import java.util.ArrayList;
import java.util.Scanner;
public class Problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(getSubstring(s));

    }
    static ArrayList<String> getSubstring(String s){
//        let s="abc"
        ArrayList<String> ans=new ArrayList<>();
        if(s.length()==0){
            ans.add(" ");
            return ans;
        }
        char curr=s.charAt(0);//a
        ArrayList<String> smallans=getSubstring(s.substring(1));
        for (String ss:smallans){
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;
    }
}
