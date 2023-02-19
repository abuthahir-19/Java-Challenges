import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class TwoSum {
    public static int[] getIndices (int[] nums, int target) {
        // int[] indx = new int[2];
        // for (int i = 0; i < nums.length; i++) {
        //     boolean found = false;
        //     for (int j = 0; j < nums.length; j++) {
        //         if (i != j && (nums[i] + nums[j]) == target) {
        //             indx[0] = i;
        //             indx[1] = j;
        //             found = true;
        //             break;
        //         }
        //     }
        //     if (found) break;
        // }
        // return indx;
        int[] indxs = new int[2];
        Map <Integer, Integer> hm = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs (target - nums[i]);
            if (hm.containsKey(diff)) {
                indxs[0] = hm.get (diff);
                indxs[1] = i;
                break;
            } else {
                hm.put (nums[i], i);
            }
        }
        return indxs;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int target = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        int[] indexes = getIndices (ar, target);
        for (int val : indexes) 
            System.out.print (val + " ");


        in.close();
    }
}
/**
4 9
2 7 11 15

3 6
3 2 4
 */