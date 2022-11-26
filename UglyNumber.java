import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println (getUglyNumber (n));
        in.close();
    }

    public static boolean getUglyNumber (int n) {
        List <Integer> primes = new ArrayList<>();
        if (n == 1) return true;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) primes.add (i);
        }
        return primes.size() <= 3 ? true : false;
    }

    public static boolean isPrime (int value) {
        if (value > 1) {
            for (int i = 2; i*i <= value; i++) {
                if (value % i == 0) return false;
            } return true;
        }else return false;
    }
}
