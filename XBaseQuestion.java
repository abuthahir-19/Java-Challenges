import java.util.Scanner;

public class XBaseQuestion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test != 0) {
            int n, k;
            n = in.nextInt();
            k = in.nextInt();
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                sum +=  (Integer.toString (i, k)).length();
            }
            System.out.println (sum);
            test--;
        }
        in.close();
    }
}
/**
3
4 2
8 3
4 3

**/