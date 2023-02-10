import java.util.Scanner;

class SinglyLinkedList {
    Invoice head ;
    Invoice tail;

    public SinglyLinkedList () {
        this.head = null;
        this.tail = null;
    }

    void append (int data) {
        Invoice d = new Invoice(data);
        if (this.head == null) {
            this.head = d;
            this.tail = d;
        } else {
            Invoice curr = this.head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = d;
            this.tail = d;
        }
    }

    public void removeAt (int pos) {
        Invoice curr = this.head, prev = null;
        if (pos == 1) {
            this.head = curr.next;
        } else {
            int idx = 1;
            while (curr != null && idx != pos) {
                idx += 1;
                prev = curr;
                curr = curr.next;
            }
            prev.next = curr.next;
            if (curr.next == null)
            this.tail = prev;
        }
    }
}

class Invoice {
    int price;
    Invoice next;
    public Invoice (int key) {
        this.price = key;
        this.next = null;
    }
}

public class ListInvoice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int price;
        SinglyLinkedList sll = new SinglyLinkedList();

        for (int i = 0; i < n; i++) {
            price = in.nextInt();
            sll.append(price);
        }

        int M = in.nextInt();
        while (M-- > 0) {
            int pos = in.nextInt();
            sll.removeAt(pos);
        }
        
        Invoice invoice = sll.head;

        while (invoice != sll.tail) {
            System.out.print (invoice.price + "->");
            invoice = invoice.next;
        }
        System.out.println (invoice.price + "->NULL");
        in.close();
    }
}

/**
5
20 40 60 80 100
2 
1 4
 */