import java.util.Scanner;

public class LinkedList {
    Node head;
    static class Node {
        int d;
        Node next;
        Node (int data) {
            d = data;
            next = null;
        }
    }

    public Node moveToFront (Node head) {
        Node lastNode = head, prev = null;
        while (lastNode.next != null) {
            prev = lastNode;
            lastNode = lastNode.next;
        }
        prev.next = null;
        lastNode.next = head;
        head = lastNode;
        return head;
    }
    
    public Node removeDuplicates (Node head) {
        Node curr = head;
        while (curr != null) {
            Node temp = curr;
            if (temp != null && temp.d == curr.d) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }
        return head;
    }

    public boolean searchRecur (Node head, int x) {
        if (head == null) return false;
        if (head.d == x) return true;
        else return searchRecur(head.next, x);
    }

    public void insert (int data) {
        if (head == null) {
            head = new Node (data);
        }
        else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new Node (data);
        }
    }

    public void remove (int data) {
        Node curr = head, prev = null;
        while (curr.d != data) {
            prev = curr;
            curr = curr.next;
        }
        if (prev == null) {
            head = curr.next;
        }
        else if (curr.next == null) {
            prev.next = null;
        }
        else prev.next = curr.next;
    }

    public boolean isPalindrome (Node head) {
        Node cur = head;
        String str = "";
        while (cur != null) {
            str += cur.d;
            cur = cur.next;
        }
        StringBuilder sbf = new StringBuilder();
        sbf.append (str);
        sbf.reverse();
        if (str.equals(sbf.toString()))
            return true;
        else return false;
    }

    public String isPresent (int data) {
        Node curr = head;
        int pos = 0;
        while (curr != null) {
            if (curr.d == data) {
                return "Element present at position :" + (pos+1);
            }
            pos++;
            curr = curr.next;
        }
        return "Not found";
    }

    public void printList (Node hd) {
        Node curr = hd;
        while (curr != null) {
            System.out.printf ("%d ", curr.d);
            curr = curr.next;
        }
        System.out.println();
    }

    public Node reverse (Node hd) {
        Node prev = null, cur = hd, next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            cur = next;
        }
        hd = prev;
        return hd;
    }

    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        Scanner in = new Scanner(System.in);
        System.out.println ("Enter the no of elements : ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int data = in.nextInt();
            obj.insert(data);
        }
        Node head_ref = obj.removeDuplicates(obj.head);
        obj.printList(head_ref);
    }
}
