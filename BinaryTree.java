import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class BinaryTree {
    TreeNode root = null;
    
    class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
        public TreeNode (int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public void insertNode (TreeNode root, int data) {
        if (root == null) {
            this.root = new TreeNode(data);
            return;
        }
        Queue <TreeNode> queue = new LinkedList<>();
        queue.add (root);

        while (!queue.isEmpty()) {
            TreeNode n = queue.poll();
            if (n.left == null) {
                n.left = new TreeNode(data);
                break;
            }
            else queue.add (n.left);

            if (n.right == null) {
                n.right = new TreeNode(data);
                break;
            } else {
                queue.add (n.right);
            }
        }
    }

    public void insert (int data) {
        this.insertNode(this.root, data);
    }

    public void printBFS () {
        Queue <TreeNode> queue = new LinkedList<>();
        queue.add (root);
        while (!queue.isEmpty()) {
            TreeNode n = queue.poll();
            System.out.print (n.value + " ");
            if (n.left != null) queue.add (n.left);
            if (n.right != null) queue.add (n.right);
        }
    }

    public List <Integer> getDFSTraversal () {
        Stack <TreeNode> stack = new Stack<>();
        List <Integer> sequence = new ArrayList<>();
        stack.push (this.root);
        while (!stack.isEmpty()) {
            TreeNode n = stack.pop();
            if (n != null && n.left == null && n.right == null) sequence.add (n.value);
            if (n.right != null) stack.push (n.right);
            if (n.left != null) stack.push (n.left);
        }
        return sequence;
    }

    public int getSumBtwnRange (int start, int end) {
        Queue <TreeNode> queue = new LinkedList<>();
        int sum = 0;
        queue.add (root);
        while (!queue.isEmpty()) {
            TreeNode n = queue.poll();
            if (n.value >= start && n.value <= end) sum += n.value;
            if (n.left != null) queue.add (n.left);
            if (n.right != null) queue.add (n.right);
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println ("Enter list of integers seperated by space : ");
        String[] input = bf.readLine().split(" ");
        BinaryTree ob = new BinaryTree();
        for (int i = 0; i < input.length; i++) {
            int data = Integer.parseInt (input[i]);
            ob.insert(data);
        }
        // System.out.println ("Enter the start and end range : ");
        // String[] rnge = bf.readLine().split(" ");
        // int low = Integer.parseInt (rnge[0]);
        // int high = Integer.parseInt (rnge[1]);
        // System.out.println ("Sum of elements between the range : " + ob.getSumBtwnRange(low, high));

        System.out.println ("List of integers which are leaf nodes : ");
        System.out.println (ob.getDFSTraversal());
        
        ob.printBFS();
    }
}

/**
3 5 1 6 2 9 8 null null 7 4
 */