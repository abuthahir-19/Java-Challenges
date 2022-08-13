import java.util.Scanner;

public class ReverseList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LinkList lst = new LinkList();

        for (int i = 0; i < n; i++) {
            int value = in.nextInt();
            lst.add(value);
        }
        System.out.println("Elements of the list : " + lst.getList());
        in.close();
    }
}

class Node {
    int data;
    Node next;
    public Node (int key) {
        this.data = key;
        this.next = null;
    }
}

class LinkList {
    Node head;
    int size;

    public LinkList () {
        this.head = null;
        this.size = 0;
    }

    public void add (int value) {
        Node node = new Node (value);
        if (this.head == null) {
            this.head = node ;
        }
        else {
            Node curr = this.head ;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = node;
        }
        this.size += 1;
    }

    public void reverseList () {

    }
    public String getList () {
        String res = "";
        Node curr = this.head;
        while (curr != null) {
            res += Integer.toString(curr.data) + " ";
            curr = curr.next;
        }
        return res;
    }
}