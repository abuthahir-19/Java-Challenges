import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BFSTree {
    static Node root = null;
    class Node {
        int key;
        Node left;
        Node right;
        Node (int data) {
            this.key = data;
            this.left = null;
            this.right = null;
        }
    }

    Node insertNode (int data, Node root) {
        if (root == null) {
            root = new Node (data);
            return root;
        }

        if (root.key > data) {
            root.left = insertNode(data, root.left);
        }
        else if (root.key < data) {
            root.right = insertNode (data, root.right);
        }
        
        return root;
    }

    void insert (int data) {
        root = insertNode(data, root);
    }

    private static void traverseInorder (Node root) {
        if (root != null) {
            traverseInorder(root.left);
            System.out.println(root.key);
            traverseInorder(root.right);
        }
    }

    public static void printTree () {
        traverseInorder(root);
    }

    private static void traverseBFS (Node root) {
        Queue <Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node node = q.poll();
            if (node.left != null) {
                q.add(node.left);
            }

            if (node.right != null) {
                q.add(node.right);
            }
            System.out.print (node.key + " ");
        }
        
    }
    public static void printBFS () {
        traverseBFS(root);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter total length of the list :");
        int n = in.nextInt();
        List <Integer> list = new ArrayList<>();
        BFSTree obj = new BFSTree();
        System.out.println("Enter the elements of the list :");
        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            obj.insert(val);
        }
        // System.out.println("Elements of the tree after insertion : ");
        // printTree();
        System.out.println("BFS traversal of the given tree elements : ");
        printBFS();
    }
}
/**
6
5 4 3 2 6 9
**/