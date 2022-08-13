import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstElementKTimes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        Solution sol = new Solution();
        System.out.println (sol.firstKElement(ar, n, k));
        in.close();
    }
}

class Solution {
    public int firstKElement (int[] ar, int size, int k) {
        Map <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            if (map.containsKey(ar[i])) {
                int c = map.get (ar[i]) + 1;
                if (c == k) return ar[i];
                map.put (ar[i], c);
            }
            else {
                map.put (ar[i], 1);
                if (map.get (ar[i]) == k) return ar[i];
            }
        }
        return -1;
    }
}

/**
7 2
1 7 4 3 4 8 7

3 1
3 1 2
**/