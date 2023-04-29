import java.util.Scanner;

public class ThreeSum {
    public static int count (int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if ((a[i] + a[j] + a[k]) == 0) count += 1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }        
        System.out.println ("Total sets :" + count(a));
        in.close();
    }
}

/***
8
30 -40 -20 -10 40 0 10 5
 */