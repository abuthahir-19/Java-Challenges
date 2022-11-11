import java.util.*;

public class ReverseVowels {
    public static boolean isVowel (char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        return false;
    }

    public static String getReversedString (String str) {
        StringBuilder vow = new StringBuilder();
        StringBuilder newString = new StringBuilder();

        int len = str.length();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (isVowel(c)) vow.append(c);
            newString.append(c);
        }
        vow.reverse();
        for (int i = 0; i < len; i++) {
            if (isVowel (str.charAt(i))) {
                newString.deleteCharAt(i);
                String s = vow.charAt(0) + "";
                newString.replace(i, i, s);
                vow.deleteCharAt(0);
            }
        }
        return new String (newString);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println (getReversedString (str));
        in.close();
    }
}