import java.util.Scanner;

public class SameUnitDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            if (ar[i] % 10 == ar[i+1] % 10) {
                System.out.printf ("%d ", ar[i]);
            }
        }
        in.close();
    }
}
/**
6
12 834 94 485 285 905

6
91 41 74 192 32 45
**/