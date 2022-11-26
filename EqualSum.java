import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EqualSum {
    int getSum (List <Integer> digs) {
        int s = 0;
        for (int val : digs) s += val;
        return s;
    }

    int getResult (int value) {
        List <Integer> digits = new ArrayList<>();
        while (value > 0) {
            int rem = value % 10;
            if (!digits.contains(rem)) digits.add (rem);
            value = value / 10;
        }
        return getSum (digits);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        EqualSum ob = new EqualSum();
        if (ob.getResult(m) == ob.getResult(n)) System.out.println("YES");
        else System.out.println("NO");
        in.close();
    }
}
