import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n1 = in.next();
        String n2 = in.next();

        BigInteger a = new BigInteger(n1);
        BigInteger b = new BigInteger(n2);

        System.out.println (a.add(b));
        System.out.println (a.multiply(b));

        in.close();
    }
}
