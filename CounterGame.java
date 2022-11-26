import java.util.Scanner;

public class CounterGame {
    public boolean isPowerOf2 (long value) {
        return Long.bitCount(value) == 1 ? true : false;
    }

    public long getNextPowerOfTwo (long value) {
        while (!isPowerOf2(value)) {
            value -= 1;
        }
        return value;
    }

    public String getWinner (long value) {
        CounterGame ob = new CounterGame();
        boolean Louis = true;
        String result = "Louis";
        while (value > 1) {
            result = Louis == true ? "Louis" : "Richard";
            if (isPowerOf2(value)) {
                value = value / 2;
            } else {
                value = value - ob.getNextPowerOfTwo(value);
            }
            Louis = !Louis;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        CounterGame ob = new CounterGame();
        while (test > 0) {
            long n = in.nextInt();
            String name = ob.getWinner(n);
            System.out.println (name);
            test -= 1;
        }
    }
}
