import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;
// import java.text.NumberFormat;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double payment = in.nextDouble();
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        nf.setCurrency(Currency.getInstance(Locale.US));
        System.out.println ("US: " + nf.format(payment));
        nf.setCurrency(Currency.getInstance(Locale.CHINA));
        System.out.println ("China: " + nf.format(payment));
        nf.setCurrency(Currency.getInstance(Locale.FRANCE));
        System.out.println ("France: " + nf.format(payment));
        in.close();
    }
}
