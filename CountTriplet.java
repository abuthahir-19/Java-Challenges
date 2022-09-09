import java.util.Scanner;

public class CountTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int k = in.nextInt();
        int count = 0;
        for (int i = 0; i < n; i +=1) {
            int s = a[i];
            for (int j = i+1; j < n-1; j++) {
                s += (a[j] + a[j+1]);
                if (s == k) count +=1;
            }
        }
        System.out.println(count);
        in.close();
    }
}
/**
6
9 -2 1 4 2 2
8
**/