import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class BinaryTree {
    TreeNode root;

    class TreeNode {
        int key;
        TreeNode left;
        TreeNode right;
        public TreeNode (int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    public void insert (int data) {
        TreeNode temp = this.root;
        if (temp == null) {
            this.root = new TreeNode(data);
            return;
        }
        Queue <TreeNode> queue = new LinkedList<>();
        queue.add (temp);
        while (!queue.isEmpty()) {
            temp = queue.remove();
            if (temp.left == null) {
                temp.left = new TreeNode(data);
                break;
            } else {
                queue.add (temp.left);
            }

            if (temp.right == null) {
                temp.right = new TreeNode(data);
                break;
            } else {
                queue.add (temp.right);
            }
        }
    }

    public void printBFS () {
        Queue <TreeNode> queue = new LinkedList<>();
        queue.add (this.root);
        while (!queue.isEmpty()) {
            TreeNode n = queue.poll();
            System.out.print (n.key + " ");

            if (n.left != null) 
                queue.add (n.left);

            if (n.right != null) {
                queue.add (n.right);
            }
        }
    }

    public void printDFS () {
        Stack <TreeNode> stack = new Stack<>();
        List <Integer> sequence = new ArrayList<>();
        stack.push (this.root);
        while (!stack.isEmpty()) {
            TreeNode n = stack.pop();
            if (n.right != null) stack.push (n.right);
            if (n.left != null) stack.push (n.left);
            if (n.left == null && n.right == null) {
                System.out.print (n.key + " ");
            }
        }
    }

    public int getSumWithinRange (int low, int high) {
        Queue <TreeNode> queue = new LinkedList<>();
        queue.add (this.root);
        int sum = 0;
        while (!queue.isEmpty()) {
            TreeNode n = queue.poll();
            if (n != null) {
                if (n.key >= low && n.key <= high) sum += n.key;
            }

            if (n.left != null) queue.add (n.left);
            if (n.right != null) queue.add (n.right);
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println ("Enter list of values seperated by space : ");
        String[] list = bf.readLine().split(" ");
        BinaryTree ob = new BinaryTree();
        for (int i = 0; i < list.length; i++) {
            int value = Integer.parseInt (list[i]);
            ob.insert(value);
        }

        System.out.println ("Values of the list : " );
        ob.printBFS();;

        // System.out.println ("DFS Traversal of the given list : ");
        // ob.printDFS();

        bf.close();
    }
}

/**
3 5 1 6 2 9 8 7 4
 */