import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double payment = in.nextDouble();

        Locale usL = new Locale ("en", "US");
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(usL);
        String us = usFormat.format(payment);


        Locale franceL = new Locale("fr", "FR");
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(franceL);
        String france = franceFormat.format(payment);

        Locale IndiaL = new Locale ("en", "IN");
        NumberFormat inFormat = NumberFormat.getCurrencyInstance(IndiaL);
        String india = inFormat.format(payment);

        Locale chinaL = new Locale ("zn", "cn");
        NumberFormat chinaFormat = NumberFormat.getInstance(chinaL);
        String china = chinaFormat.format(payment);

        System.out.println("US : " + us);
        System.out.println("India : " + india);
        System.out.println("China : " + china);
        System.out.println("France : " + france);
        in.close();
    }
}
