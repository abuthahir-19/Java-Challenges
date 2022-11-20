import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BitFlipping {
    public static long getBitsFlipped (long n) {
        List <Integer> bits = new ArrayList<>();
        for (int i = 1; i <= 32; i++) {
            bits.add (1);
        }
        int z = bits.size()-1;
        while (n > 0) {
            long rem = n % 2;
            if (rem == 1) {
                bits.set(z, 0);
            } else bits.set (z, 1);
            z-=1;
            n>>=1;
        }
        long sum = 0;
        int e = bits.size()-1;
        for (int i = 0; i < bits.size(); i++) {
            sum += (Math.pow (2, e) * bits.get(i));
            e -= 1;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        long n = in.nextLong();
        System.out.println (getBitsFlipped (n));
        in.close();
    }
}