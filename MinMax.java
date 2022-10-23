import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        for (int i = 0; i < n; i+=1) {
            int curr = ar[i];
            if (curr < min) {
                min = curr;
            }
            if (curr > max) {
                max = curr;
            }
        }
        System.out.println ("Minimum element of the given list : " + min);
        System.out.println ("Maximum element of the given list : " + max);
        in.close();
    }
}
/**
6
3 2 1 56 10000 167

5
1 345 234 21 56789
***/