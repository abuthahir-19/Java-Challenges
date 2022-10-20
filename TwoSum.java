import java.util.Scanner;

public class TwoSum {
    public static int[] getIndices (int[] nums, int target) {
        int[] indx = new int[2];
        for (int i = 0; i < nums.length; i++) {
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && (nums[i] + nums[j]) == target) {
                    indx[0] = i;
                    indx[1] = j;
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        return indx;
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
