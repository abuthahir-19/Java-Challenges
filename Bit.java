import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Bit {
    public static void main(String[] args) throws IOException {
        PriorityQueue <Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] rnge = bf.readLine().split(" ");
        int n = Integer.parseInt(rnge[0]);
        int k = Integer.parseInt(rnge[1]);
        String[] line = bf.readLine().split(" ");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt (line[i]);
        }

        for (int i = 0; i < n; i++) {
            minHeap.add (arr[i]);
        }

        System.out.println (minHeap);
        bf.close();
    }
}
/*
5 2
12 5 787 1 23
 */