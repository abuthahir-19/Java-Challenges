import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class TreeDataStructure {
    Node root = null;

    class Node {
        int data;
        Node left, right;
        Node (int key) {
            this.data = key;
            this.left = null;
            this.right = null;
        }
    }

    private Node insertData (Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insertData(root.left, data);
        }
        else if (data > root.data) {
            root.right = insertData(root.right, data);
        }
        return root;
    }

    public void insert (int data) {
        this.root = insertData(this.root, data);
    }

    private void print (Node root) {
        if (root != null) {
            print (root.left);
            System.out.print (root.data + " ");
            print (root.right);
        }
    }

    public void printInorder () {
        print (this.root);
    }

    private void BFS (Node root) {
        Queue <Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node s = queue.poll();
            System.out.print (s.data + " ");
            if (s.left != null) {
                queue.add(s.left);
            }

            if (s.right != null) {
                queue.add(s.right);
            }
        }
    }

    private void DFS (Node root) {
        Stack <Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.print (node.data + " ");
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    public void getBFS () {
        BFS(this.root);
    }

    public void getDFS () {
        DFS(this.root);
    }
}

public class CheckForBST {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Enter no of elements : ");
        int n = in.nextInt();
        System.out.println("Enter the elements : ");
        TreeDataStructure tree = new TreeDataStructure();

        for (int i = 0; i < n; i++) {
            int value = in.nextInt();
            tree.insert(value);
        }

        System.out.println("Inorder traversal of the tree : ");
        tree.printInorder();

        System.out.println();
        System.out.println("BFS traversal of the tree : ");
        tree.getBFS();

        System.out.println ();
        System.out.println ("DFS traversal of the tree : ");
        tree.getDFS();
        in.close();
    }
}

/**
8
5 4 3 2 1 7 6 8
**/