import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxProduct {
    public static int getMaximumProduct (int[] nums) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;

            if (max_ending_here < 0) max_ending_here = 1;
            max_ending_here = max_ending_here * nums[i];
        }
        if (max_ending_here > max_so_far) max_so_far = max_ending_here;
        return max_so_far;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bf.readLine().split(" ");
        int[] arr = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }
        int prod = getMaximumProduct (arr);
        System.out.println (prod);
        bf.close();
    }
}
/**
2 3 -2 4
 */