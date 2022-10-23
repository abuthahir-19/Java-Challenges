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

        int sum = 0;
        for (int i = n-1; i >= 0; i--) {
            int v1 = arr[i];
            int v2 = arr[i]-1;
            
            if (f.containsKey (v1)) {
                int val = f.get(v1);
                if (val > 0) {
                    sum += v1;

                    f.put (v1, f.get(v1)-1);

                    if (f.containsKey(v2)) {
                        f.put (v2, f.get(v2)-1);
                    }
                }
            }
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