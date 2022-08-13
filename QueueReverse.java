import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QueueReverse {
    static Queue <Integer> queue ;
    static void Print () {
        Iterator <Integer> it = queue.iterator();
        while (it.hasNext()) {
            System.out.printf ("%d ", it.next());
        }
        System.out.println();
    }

    static void reverseQueue () {
        Stack <Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.peek());
            queue.remove();
        }

        while (!stack.isEmpty()) {
            queue.add(stack.peek());
            stack.pop();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add (sc.nextInt());
        }
        System.out.println ("Elements of the queue before reverse process :");
        Print();
        reverseQueue();
        System.out.println ("Elements of the queue after reverse process :");
        Print();
        sc.close();
    }
}