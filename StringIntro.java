import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println (isPalindrome (str) ? "Yes" : "No");
        in.close();
    }
    
    private static boolean isPalindrome (String str) {
        StringBuilder sbf = new StringBuilder();
        sbf.append(str);
        sbf.reverse();
        return sbf.toString().equals(str);
    }
}