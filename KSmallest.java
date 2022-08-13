import java.util.*;

public class KSmallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        System.out.println (KSmallEle (ar, n, k));
        in.close();
    }

    private static PriorityQueue <Integer> KSmallEle (int[] arr, int size, int k) {
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int val : arr) {
            pq.add(val);
            if (pq.size() > k) pq.poll();
        }
        return pq;
    }
}

/**
6 4
1 10 12 9 2 3 
**/