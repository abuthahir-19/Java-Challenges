import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximizeSum {
    public static int getMaxSum (int[] arr, int n) {
        Map <Integer, Integer> f = new HashMap<>();
        for (int i : arr) {
            if (f.containsKey(i)) {
                int c = f.get(i) + 1;
                f.put (i, c);
            } else {
                f.put (i, 1);
            }
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int sum = 0;
        while (f.size() > 0) {
            sum += max;
            if (f.containsKey (max-1)) {
                int mC = f.get(max) -1;
                int mMinC = f.get(max-1) - 1;

                if (mC == 0) {
                    f.remove(max);
                } else {
                    f.put(max, mC);
                }

                if (mMinC == 0) {
                    f.remove(max-1);
                } else {
                    f.put (max-1, mMinC);
                }
            } else {
                int mC = f.get(max) - 1;

                if (mC == 0) {
                    f.remove(max);
                } else {
                    f.put (max, mC);
                }
            }

            if (f.size() > 0)
            sum = Collections.max(f.keySet());
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int sum = getMaxSum (a, n);
        System.out.println ("The maximum sum that is obtained : " + sum);
        in.close();
    }
}

/**
6
1 2 2 2 3 4

3
1 2 3
**/