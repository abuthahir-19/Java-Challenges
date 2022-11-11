import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountIntegeEvenSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
        int num = Integer.parseInt (bf.readLine());
        System.out.println (getCountOfNums(num));
        bf.close();
    }

    static int getSum (int n) {
        int s = 0;
        while (n != 0) {
            s += (n % 10);
            n /= 10;
        }
        return s;
    }

    public static int getCountOfNums (int num) {
        int c = 0;
        for (int i = 2; i <= num; i++) {
            if (getSum(i) % 2 == 0) c += 1;
        }
        return c;
    }
}
