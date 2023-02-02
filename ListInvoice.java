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

        Invoice invoice = sll.head;
        while (invoice != sll.tail) {
            System.out.print (invoice.price + "->");
            invoice = invoice.next;
        }
        System.out.println (invoice.price + "->NULL");
        in.close();
    }
}
