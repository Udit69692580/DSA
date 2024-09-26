import java.util.Scanner;
public class Problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(occurance(s,0));
    }
    static String occurance(String s,int idx){
//        String ans=" ";
//        for (int i=0;i<s.length();i++){
//            if (s.charAt(i)!='a'){
//                ans+=s.charAt(i);
//            }
//        }
//        System.out.println(ans);
//        Recursion
        if (idx==s.length()) return " ";
        String sans=occurance(s,idx+1);
        char currentCharacter=s.charAt(idx);
         if (currentCharacter!='a'){
             return currentCharacter+sans;
         }else{
             return sans;
         }

    }
}
