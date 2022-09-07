import java.util.Scanner;

public class OddEvenWar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        int o = 0, e = 0;
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
            if (ar[i] % 2 == 0) e += ar[i];
            else o += ar[i];
        }
        if (e == o) System.out.println("Tied");
        else if (e > o) System.out.println("Even");
        else System.out.println("Odd");
        in.close();
    }
}
