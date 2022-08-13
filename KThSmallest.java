// import java.util.Iterator;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KThSmallest {
    public static void KSmallest (int[] ar, int size, int k) {
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < size; i++) {
            pq.add(ar[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        while (!pq.isEmpty()) {
            System.out.print (pq.peek() + " ");
            pq.poll();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for (int i =0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        KSmallest(ar, n, k);
    }
}
/**
6 2
1 10 12 9 2 3
*/