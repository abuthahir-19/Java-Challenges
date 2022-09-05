import java.util.*;

public class AddingArrayElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = in.nextInt();
        DateDisplay obj = new DateDisplay();
        int res = obj.minOperations(ar, n, k);
        // System.out.println (res);
        in.close();
    }
}

class Solution {
    public static PriorityQueue<Integer> KSmallest (int[] ar, int size, int k) {
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < size; i++) {
            pq.add(ar[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq;
    }

    private static boolean isGreaterThanK (int[] ar, int k) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < k) {
                return false;
            }
        }
        return true;
    }

    int minOperations (int[] ar, int n, int k) {
        if (isGreaterThanK(ar, k)) {
            return 0;
        }
        else {
            PriorityQueue <Integer> pq = new PriorityQueue<>();
            pq = KSmallest(ar, n, k);
            int ind1 = -1, ind2 = -1;
            for (int i = 0; i < n; ++i) {
                if (pq.contains(ar[i])) {
                    if (ind1 != -1) {
                        ind1 = i;
                    }
                    else {
                        ind2 = i;
                    }
                }
                if (ind1 != -1 && ind2 != -1) break;
            }
            int sum = ar[ind1] + ar[ind2];
            
        }
        return 0;
    }
}