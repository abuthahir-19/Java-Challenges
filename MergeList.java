import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeList {
    Node head;

    class Node {
        int data;
        Node next;
        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert (int data) {
        if (this.head == null) {
            this.head = new Node (data);
        }
        else {
            Node curNode = this.head;
            while (curNode.next != null) {
                curNode = curNode.next;
            }
            curNode.next = new Node (data);
        }
    }    

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int test = in.nextInt();
        while (test > 0) {
            int n = in.nextInt();
            List <Integer> list1 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list1.add (in.nextInt());
            }
            int m = in.nextInt();
            List <Integer> list2 = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                list2.add (in.nextInt());
            }

            test -= 1;
        }
    }
}
