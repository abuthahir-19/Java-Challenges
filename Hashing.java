import java.util.ArrayList;
import java.util.Objects;
// import java.util.Scanner;

class HashNode <K, V> {
    K key;
    V value;
    final int hashCode;
    HashNode <K, V> next;

    public HashNode (K key, V value, int hashCode) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }
}

public class Hashing <K, V> {
    private ArrayList <HashNode <K, V>> lst;
    private int capacity;
    private int size;

    public Hashing (int capacity) {
        lst = new ArrayList<>();
        this.capacity = capacity;
        this.size = 0;
        for (int i = 0; i < capacity; i++) {
            lst.add(null);
        }
    }
    
    public int getSize() {
        return size;
    }

    public boolean isEmpty () {
        return getSize() == 0;
    }

    private int getHashCode (K key) {
        return Objects.hashCode(key);
    }

    private int getSlotIndex (K key) {
        int hshcd = getHashCode(key);
        int ind = hshcd % capacity;
        ind = ind < 0 ? ind * -1 : ind;
        return ind;
    }

    public V get (K key) {
        int hshcd = getHashCode(key);
        int ind = getSlotIndex(key);
        HashNode <K, V> head = lst.get(ind);
        while (head != null) {
            if (head.key.equals(key) && hshcd == head.hashCode) 
                return head.value;
            head = head.next;
        }
        return null;
    }

    public V remove (K key) {
        int index = getSlotIndex(key);
        int hshcd = getHashCode(key);

        HashNode <K, V> head = lst.get(index);
        HashNode <K, V> prev = null;

        while (head != null) {
            if (head.key.equals(key) && hshcd == head.hashCode) {
                break;
            }
            prev = head;
            head = head.next;
        }
        if (head == null) {
            return null;
        }

        size-=1;
        if (prev != null) {
            prev.next = head.next;
        }
        else {
            lst.set(index, head.next);
        }
        return head.value;
    }

    public void add (K key, V value) {
        int index = getSlotIndex(key);
        int hshcd = getHashCode(key);

        HashNode<K,V> head = lst.get(index);

        while (head != null) {
            if (head.key.equals(key) && hshcd == head.hashCode) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        size+=1;
        head = lst.get(index);
        HashNode <K, V> newNode = new HashNode<>(key, value, hshcd);
        newNode.next = head;
        lst.set(index, newNode);
    }

    public static void main(String[] args) {
        // Scanner in = new Scanner (System.in);
        int cap = 10;
        Hashing <String, Integer> hsh = new Hashing<>(cap);
        hsh.add("this", 1);
        hsh.add ("coder", 2);
        hsh.add ("this", 4);
        hsh.add ("hi", 5);
        System.out.println (hsh.getSize());
    }
}