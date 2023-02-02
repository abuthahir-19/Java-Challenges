import java.util.Scanner;

public class RevFirstThree {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String s = in.next();
        StringBuilder sbf = new StringBuilder();
        sbf.append (s.substring(0, 3));
        sbf.reverse();
        System.out.println (Integer.parseInt (sbf.toString()));
        in.close();
    }
}