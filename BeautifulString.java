import java.util.Scanner;

public class BeautifulString {
    public static boolean LeadingZeroCheck (String s) {
        if (!(s.charAt(0) == '0')) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test > 0) {
            String s = in.next();
            seperateNumbers (s);
            test -= 1;
        }
    }

    public static void seperateNumbers (String s) {
        int len = s.length();

        for (int i = 1; i <= len/2; i++) {
            String sub = s.substring(0, i);
            int num = Integer.parseInt (sub);
            int temp = num;
            while (sub.length() < s.length()) {
                sub += (++num);
            }
            if (LeadingZeroCheck(sub) && sub.equals(s)) {
                System.out.println ("YES " + temp);
                return ;
            }
        }
        System.out.println("NO");
    }
}
