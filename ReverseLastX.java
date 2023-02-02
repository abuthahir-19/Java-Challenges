import java.util.Scanner;

public class ReverseLastX {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String n = in.next();
        int x = in.nextInt();
        StringBuilder sbf = new StringBuilder();
        sbf.append (n.substring(n.length()-x, n.length()));
        sbf.reverse();
        System.out.println (n.substring(0, n.length() - x) + sbf.toString());
        in.close();
    }
}
