import java.math.BigInteger;
import java.util.Scanner;

public class PrimaltyTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        BigInteger bi = new BigInteger(n);
        boolean result = bi.isProbablePrime(1);
        result = bi.isProbablePrime(0);
        result = bi.isProbablePrime(-1);
        if (result) {
            System.out.println ("prime");
        }else System.out.println("not prime");
        in.close();
    }
}
