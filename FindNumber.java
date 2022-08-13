import java.util.Scanner;

public class FindNumber {
    public static int getNumber (int value, int s) {
        int x;
        if (s < 0) {
            x = Math.abs (value + s);
        }
        else {
            x = value - s;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = in.nextInt();
        System.out.println (getNumber(n, sum));
    }
}