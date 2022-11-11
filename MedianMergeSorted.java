import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MedianMergeSorted {
    public static void printArray (int[] nums1) {
        for (int d : nums1) {
            System.out.print (d + " ");
        }
        System.out.println();
    }

    public static double getMedianSorted (int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length + nums2.length];
        int len = 0;
        double res;
        for (int i = 0; i < nums1.length; i++) {
            temp[len++] = nums1[i];
        }

        for (int val : nums2) 
            temp[len++] = val;
        
        Arrays.sort (temp);
        if (len % 2 == 0)
        res = (double) (temp[len/2-1] + temp[len/2])/2;  
        else res = temp[temp.length/2];
        return res;      
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = bf.readLine().split(" ");
        String[] line2 = bf.readLine().split(" ");
        int[] num1 = new int[line1.length];
        int[] num2 = new int[line2.length];

        for (int i = 0; i < line1.length; i++) {
            num1[i] = Integer.parseInt(line1[i]);
        }

        for (int i = 0; i < line2.length; i++) {
            num2[i] = Integer.parseInt(line2[i]);
        }

        // System.out.println (getMedianSorted(num1, num2));
        System.out.println (getMedianSorted(num1, num2));
        bf.close();
    }
}
/**
1 3
2

1 2
1 
 */