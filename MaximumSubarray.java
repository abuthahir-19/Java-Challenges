import java.util.Scanner;

public class MaximumSubarray {
    public static int getMaxSum (int[] nums, int size) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int i : nums) {
            max_ending_here = max_ending_here + i;
            if (max_ending_here > max_so_far) {
                max_so_far = max_ending_here;
            }

            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        System.out.println (getMaxSum(ar, n));
        in.close();
    }
}

/**
8
-2 -3 4 -1 -2 1 5 -3

9
-2 1 -3 4 -1 2 1 -5 4

1
1

5
5 4 -1 7 8
**/