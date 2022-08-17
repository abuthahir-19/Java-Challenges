import java.util.*;
import java.util.LinkedList;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class PrintPath {
    static Map <Integer, ArrayList <Integer>> g = new HashMap<>();
    static Map <Integer, Boolean> visited = new HashMap<>();
    private static int v;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        v = in.nextInt();
        for (int i = 0; i < v; i++) {
            int src = in.nextInt();
            int vertex = in.nextInt();
            if (!visited.containsKey(src)) {
                visited.put (src, false);
            }
            else if (!visited.containsKey(vertex)) {
                visited.put (vertex, false);
            }

            ArrayList <Integer> dest = new ArrayList<>();
            dest.add(vertex);

            if (g.containsKey (src)) {
                ArrayList <Integer> l = g.get(src);
                l.add(vertex);
                g.put (src, l);
            }
            else g.put (src, dest);
        }
        findPaths(7, 9);
        // printGraph();
        in.close();
    }

    public static void BFS (int s) {
        LinkedList <Integer> queue = new LinkedList<>();
        visited.put(s, true);
        queue.add(s);
        while (queue.size() != 0) {
            s = queue.poll();
            System.out.println (s + " ");
            if (g.containsKey(s)) {
                Iterator<Integer> i = g.get(s).listIterator();
                while (i.hasNext()) {
                    int val = i.next();
                    if (!visited.get(val)) {
                        visited.put(val, true);
                        queue.add(val);
                    }
                }
            }
        }
    }

    public static void findCost (List <Integer> path) {
        int size = path.size();
        for (int i = 0; i < size; i++) {
            System.out.print (path.get(i) + " ");
        }
        System.out.println();
    }

    public static boolean isNotVisited (int x, List <Integer> path) {
        int size = path.size();
        for (int i = 0; i < size; i++) {
            if (path.get(i) == x) return false;
        }
        return true;
    }

    public static void findPaths (int src, int dest) {
        Queue <List<Integer>> queue = new LinkedList<>();

        List <Integer> path = new ArrayList<>();
        path.add(src);
        queue.add (path);
        while (!queue.isEmpty()) {
            path = queue.poll();
            int last = path.get(path.size()-1);
            if (last == dest) {
                findCost (path);
            }
            if (g.containsKey(last)) {
                List<Integer> lastNode = g.get(last);
                for (int i = 0; i < lastNode.size(); i++) {
                    int val = lastNode.get(i);
                    if (isNotVisited(val, path)) {
                        List<Integer> newPath = new ArrayList<>(path);
                        newPath.add(val);
                        queue.add(newPath);
                    }
                }
            }
        }
    }

    private static void printGraph () {
        for (Map.Entry <Integer, ArrayList<Integer>> o : g.entrySet()) {
            System.out.println (o.getKey() + " " + o.getValue());
        }
    }
}

/**
4
2 9
7 2
7 9
9 5

**/