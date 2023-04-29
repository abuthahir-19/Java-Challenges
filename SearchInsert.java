import java.util.Scanner;

public class SearchInsert {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println (getIndexOfValue (nums, target));
    }

    public static int getIndexOfValue (int[] nums, int target) {
        int low = 0, high = nums.length-1, mid;
        while (low < high) {
            mid = (low + high) / 2;
            int value = nums[mid];
            if (value == target) {
                return mid;
            }

            if (value > target) {
                high = mid - 1;
            } else low = mid + 1;
        }
        return high + 1;
    }
}

/**
4
1 3 5 6
5
 */