class Node {
    int data;
    int prio;
    Node next;
    Node (int d, int p) {
        data = d;
        prio = p;
        next = null;
    }
}

public class PrioQueue {
    Node head;
    static int size = 0;
    public void enQueue (int data, int prio) {
        Node node = new Node(data, prio);
        if (head == null) {
            head = node;
        }
        else {
            Node curr = head, prev = null;
            while (curr.prio >= node.prio) {
                prev = curr;
                curr = curr.next;
            }
            if (prev == null) {
                node.next = head;
                head = node;
            }else {
                prev.next = node;
                node.next = curr;
            }
        }
        size++;
    }

    public void deQueue () {
        head = head.next;
        size--;
    }

    public boolean isEmtpy () {
        return head == null;
    }

    public int length() {
        return size;
    }

    public void printList () {
        Node cur = head;
        while (cur != null) {
            System.out.println (cur.data + ":" + cur.prio);
            cur = cur.next;
        }
    }
    public static void main(String[] args) {
        PrioQueue pq = new PrioQueue();
        pq.enQueue(5, 1);
        pq.enQueue(10, 4);
        pq.enQueue(67, 3);
        pq.enQueue(90, 2);
        pq.enQueue(36, 4);

        System.out.println ("Elements of the priority queue list :");
        pq.printList();;
        pq.deQueue();;

        System.out.println ("Elements of the priority queue list :");
        pq.printList();;
    }
}