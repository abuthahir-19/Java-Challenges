import java.util.Scanner;

public class FirstLastN {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String s = in.next();
        int n = in.nextInt();
        in.close();
        System.out.println (s.substring(0, n) + "" + s.substring(s.length()-n, s.length()));
    }
}