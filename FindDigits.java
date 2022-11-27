import java.util.Scanner;

public class FindDigits {
    public int findDivisor (int n) {
        int count = 0;
        int temp = n;
        while (n > 0) {
            int d = n % 10;
            if (d != 0 && temp % d == 0) count += 1;
            n = n / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FindDigits ob = new FindDigits();
        int n = in.nextInt();
        System.out.println(ob.findDivisor(n));
        in.close();
    }   
}