import java.util.Arrays;
import java.util.Scanner;

public class MergeSorted {
    public static void getMerged (int[] nums1, int m, int[] nums2, int n) {
        int len = nums1.length;
        for (int i = 0; i < nums2.length; i++) {
            int value = nums2[i];
            boolean inserted = false;
            for (int j = 0; j < len-1; j++) {
                int v = nums1[j];
                if (v == 0) {
                    nums1[j] = value;
                    inserted = true;
                    break;
                }
                if (value >= v && value <= nums1[j+1]) {
                    int k = len-2;
                    for (; k > j; k--) {
                        nums1[k+1] = nums1[k];
                    }
                    nums1[j+1] = value;
                    inserted = true;
                    break;
                }
            }
            if (!inserted) {
                nums1[len-1] = value;
            }
        }
        Arrays.sort(nums1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len1 = in.nextInt();
        int len2 = in.nextInt();
        int m = in.nextInt();
        int nums1[] = new int[len1];
        int n = in.nextInt();
        int nums2[] = new int[len2];
        for (int i = 0; i < len1; i++) {
            nums1[i] = in.nextInt();
        }
        for (int j = 0; j < len2; j++) {
            nums2[j] = in.nextInt();
        }

        getMerged (nums1, m, nums2, n);

        // insertAtAppropriatePos(nums1, 4);
        for (int i : nums1) 
            System.out.print (i + " ");
        
        in.close();
    }
}

/**
6 3
3 3
1 2 3 0 0 0
2 5 6

1 0
1 0
1

1 1
0 1
0
1
**/