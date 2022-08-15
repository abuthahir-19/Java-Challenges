import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

class EdgeNode {
    int v;
    int time;
    EdgeNode (int v, int time) {
        this.v = v;
        this.time = time;
    }
}

public class ShortestTime {
    static Map <Integer, ArrayList<EdgeNode>> map = new HashMap<>();
    private static List <Integer> cost = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> members = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            members.add(in.nextInt());
        }
        int edge = in.nextInt();
        for (int i = 0; i < edge; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            int t = in.nextInt();
            addEdgeAndTime(u, v, t);
        }
        int A = in.nextInt();
        int B = in.nextInt();
        findPaths(A, B);
        System.out.println (Collections.min(cost));
        in.close();
    }

    private static void addEdgeAndTime(int u, int v, int time) {
        EdgeNode node = new EdgeNode(v, time);
        if (map.containsKey(u)) {
            ArrayList<EdgeNode> obj = map.get(u);
            obj.add(node);
            map.put (u, obj);
        }
        else {
            ArrayList <EdgeNode> obj = new ArrayList<>();
            obj.add(node);
            map.put(u, obj);
        }
    }

    private static void findCost (List <Integer> list) {
        int c = 0;
        int s = list.size();
        for (int i = 0; i < s-1; i++) {
            int sc = list.get(i), d = list.get(i+1);
            List<EdgeNode> verteces = map.get(sc);
            for (EdgeNode node : verteces) {
                if (node.v == d) {
                    c += node.time;
                    break;
                }
            }
        }
        cost.add(c);
    }

    private static boolean isNotVisited (int key, List <Integer> path) {
        int size = path.size();
        for (int i = 0; i < size; i++) {
            if (path.get(i) == key) return false;
        }
        return true;
    }

    private static void findPaths (int src, int dest) {
        Queue <List<Integer>> queue = new LinkedList<>();
        List <Integer> path = new ArrayList<>();
        path.add(src);
        queue.add(path);

        while (!queue.isEmpty()) {
            path = queue.poll();
            int last = path.get(path.size()-1);
            if (last == dest) {
                findCost(path);
            }
            if (map.containsKey(last)) {
                List<EdgeNode> lastNode = map.get(last);
                for (int i = 0; i < lastNode.size(); i++) {
                    if (isNotVisited(lastNode.get(i).v, path)) {
                        List<Integer> newPath = new ArrayList<>(path);
                        newPath.add(lastNode.get(i).v);
                        queue.add(newPath);
                    }
                }
            }
        }
    }

    // private static void printGraph () {
    //     for (Map.Entry <Integer, ArrayList<EdgeNode>> obj : map.entrySet()) {
    //         System.out.print(obj.getKey() + " ");
    //         ArrayList <EdgeNode> lst = obj.getValue();
    //         for (EdgeNode data : lst) 
    //             System.out.print ("[" + data.v + ", " + data.time + "]" + " ");
    //         System.out.println();
    //     }
    // }
}

/**
4
2
5
7
9
4
2 9 2
7 2 3
7 9 7
9 5 1
7
9
**/