import java.util.Scanner;

public class Prime {
    private static boolean isPrime (int value) {
        if (value > 1) {
            for (int i = 2; i*i <= value; i+=1) {
                if (value % i == 0) return false;
            }
            return true;
        } return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (isPrime(n)) System.out.println("Yes");
        else System.out.println("No");
        in.close();
    }
}
