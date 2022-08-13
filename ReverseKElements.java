import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseKElements {
    private static Queue<Integer> ReverseFirstK (Queue <Integer> q, int k) {
        Stack <Integer> Kstack = new Stack<>();
        Queue <Integer> rem = new LinkedList<>();
        int i = 0;
        while (i < k) {
            Kstack.push(q.remove());
            i++;
        }
        while (!q.isEmpty()) {
            rem.add(q.remove());
        }
        while (!Kstack.isEmpty()) {
            q.add(Kstack.pop());
        }
        while (!rem.isEmpty()) {
            q.add(rem.remove());
        }
        return q;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        Queue <Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(in.nextInt());
        }
        q = ReverseFirstK(q, k);
        while (!q.isEmpty()) {
            System.out.printf ("%d ", q.remove());
        }
        in.close();
    }
}
