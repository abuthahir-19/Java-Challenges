import java.util.Scanner;

public class LastXChars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int x = in.nextInt();
        StringBuilder sbf = new StringBuilder();
        sbf.append(s.substring(s.length()-x, s.length()));
        sbf.reverse();
        System.out.println (s.substring(0, s.length()-x) + sbf.toString());
        in.close();
    }
}
