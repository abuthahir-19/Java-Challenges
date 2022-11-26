import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountSetBit {
    public static long getInvertedBitNumber (long n) {
        List <Integer> bits = new ArrayList<>();
        for (int i = 0; i < 32; i++) bits.add (1);
        int end = bits.size()-1;
        while (n > 0) {
            int rem = (int) n % 2;
            bits.set(end, rem);
            end -= 1;
            n = n >> 1;
        }
        long sum = 0;
        while (bits.size() > 0) {
            sum += (Math.pow (2, bits.size()-1) * bits.remove(0));
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        System.out.println (getInvertedBitNumber(n));
        in.close();
    }
}
