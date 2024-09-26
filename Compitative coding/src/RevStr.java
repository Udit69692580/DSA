import java.util.Scanner;

public class RevStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String reversedString = reverse(s, 0);
        System.out.println("Reversed String: " + reversedString.trim());


        if (s==reversedString) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    static String reverse(String s, int idx) {
        if (idx == s.length()) return " ";
        String smalans = reverse(s, idx + 1);
        return smalans + s.charAt(idx);
    }

    static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
