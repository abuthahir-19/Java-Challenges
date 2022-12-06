import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    public Node oddEvenList (Node head) {
        Node modList = head, prev = null;
        Node even = null, Eprev = null;;

        while (modList != null) {
            prev = modList;
            modList = modList.next;
            if (modList != null) {
                Node n = new Node(modList.d);
                modList = modList.next;
                prev.next = modList;
                if (even == null) {
                    even = n;
                    Eprev = even;
                } else {
                    Eprev.next = n;
                    Eprev = n;
                }
            }
        }
        prev.next = even;
        return head;
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
    
    public Node mergeList (Node list1, Node list2) {
        Node currS = list2;
        while (currS != null) {
            Node currF = list1, prev = null;
            while (currF != null) {
                if (currS.d <= currF.d) break;
                prev = currF;
                currF = currF.next;
            }

            Node newNode = new Node(currS.d);
            if (prev == null) {
                newNode.next = list1;
                list1 = newNode;
            } else {
                prev.next = newNode;
                newNode.next = currF;
            }
            currS = currS.next;
        }
        return list1;
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

    public static void main(String[] args) throws IOException {
        LinkedList obj = new LinkedList();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] list = bf.readLine().split(" ");
        LinkedList ob = new LinkedList();
        for (int i = 0; i < list.length; i++) {
            int value = Integer.parseInt (list[i]);
            ob.insert(value);
        }
        Node head = ob.oddEvenList(ob.head);
        ob.printList(head);

    }
}
