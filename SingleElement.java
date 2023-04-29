import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingleElement {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println(singleNonDuplicate (nums));
    }

    public static int singleNonDuplicate (int[] nums) {
        Map <Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put (nums[i], map.get (nums[i]) + 1);
            } else {
                map.put (nums[i], 1);
            }
        }

        for (Integer key : map.keySet()) {
            if (map.get (key) == 1) {
                return key;
            }
        }
        return 0;
    }
}
