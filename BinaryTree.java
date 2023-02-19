import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

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

    public List <List<Integer>> getLevelOrderList (TreeNode root) {
        Queue <TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        queue.add (root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List <Integer> list = new ArrayList<>();
            while (size > 0) {
                TreeNode n = queue.poll();
                list.add (n.value);
                if (n.left != null) queue.add (n.left);
                if (n.right != null) queue.add (n.right);
                size -= 1;
            }
            result.add (list);
        }
        return result;
    }

    public List <List<Integer>> getZigZagLevelOrder (TreeNode root) {
        Queue <TreeNode> queue = new LinkedList<>();
        boolean rev = true;
        List<List<Integer>> result = new LinkedList<>();
        queue.add (root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List <Integer> list = new ArrayList<>();
            while (size > 0) {
                TreeNode n = queue.poll();
                list.add (n.value);
                if (n.left != null) queue.add (n.left);
                if (n.right != null) queue.add (n.right);
                size -= 1;
            }
            if (rev) {
                result.add (list);
            } else {
                Collections.reverse(list);
                result.add (list);
            }
            rev = !rev;
        }
        return result;
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
        System.out.println ("Get the level order traversal of tree in list : ");
        List <List<Integer>> res = ob.getZigZagLevelOrder (ob.root);
        
        for (List<Integer> list : res) {
            System.out.println (list);
        }

        ob.printBFS();
    }
}

/**
3 5 1 6 2 9 8 7 4
 */