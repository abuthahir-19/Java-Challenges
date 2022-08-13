import java.util.Scanner;

public class NumberUDMul {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.printf ("%d ", ar[i] * (ar[n-1] % 10));
            }
            else System.out.printf ("%d ", ar[i] * (ar[i-1] % 10));
        }
        in.close();
    }
}
/*
5
12 34 11 15 16

3
123 145 16
**/