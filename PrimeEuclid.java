import java.util.Scanner;

public class PrimeEuclid {
    public static int getGCD (int a, int b) {
        if (a < b) {
            int t = a;
            a = b;
            b =  t;
        }
        if (b == 0) return a;
        else return getGCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (getGCD(n, i) == 1) count += 1;
        }
        System.out.println(count);
        in.close();
    }
}
