import java.util.Scanner;

public class PalindromeCiphers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test!=0) {
            String s = in.next();
            if (isPalindrome(s)) {
                System.out.println ("Palindrome");
            }
            else {
                int prod = 1;
                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);
                    prod = prod * ((ch - 'a')+1);
                }
                System.out.println(prod);
            }
            test--;
        }
        in.close();
    }

    private static boolean isPalindrome (String s) {
        StringBuilder sbf = new StringBuilder();
        sbf.append(s);
        sbf.reverse();
        return sbf.toString().equals(s);
    }
}
