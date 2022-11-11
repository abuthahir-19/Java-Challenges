import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PivotIndex {
    public static int isPivotIndex (int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            rightSum += nums[i];
        }

        for (int i = 0; i < n; i++) {
            rightSum -= nums[i];
            if (leftSum == rightSum) return i;
            leftSum += nums[i];
        }

        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bf.readLine().split(" ");
        int n = line.length;
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = Integer.parseInt (line[i]);
        }
    }
}
