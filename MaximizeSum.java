import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximizeSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        Solution obj = new Solution();
        int res = obj.maximizeSum(a, n);
        System.out.println (res);
        in.close();
    }
}

class Solution {
    public static int[] removeElement (int arr[], int val) {
        if (arr.length > 0) {
            int[] temp = new int[arr.length-1];
            int k = 0;
            boolean found = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == val)
                        if (!found) {
                            found = true;
                            continue;
                        }
                        else temp[k++] = arr[i];

                else temp[k++] = arr[i];
            }
            return temp;
        } else return arr;
    }

    public int maximizeSum (int arr[], int n) {
        Map <Integer, Integer> f = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (f.containsKey(arr[i])) {
                int c = f.get(arr[i]) + 1;
                f.put (arr[i], c);
            } else {
                f.put (arr[i], 1);
            }
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int sum = 0;
        while (arr.length > 0) {
            sum += max;
            if (f.containsKey (max-1)) {
                arr = removeElement(arr, max);
                arr = removeElement(arr, max-1);
            } else {
                arr = removeElement(arr, max);
            }

            if (arr.length > 0)
                max = Arrays.stream(arr).max().getAsInt();
        }
        return sum;
    }
}

/**
6
1 2 2 2 3 4

3
1 2 3
**/