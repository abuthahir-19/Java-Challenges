import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Queue;
import java.util.List;
import java.util.LinkedList;

public class ShortTime {
    static Map <Integer, List <Integer>> g = new HashMap<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int edges = in.nextInt();
        for (int i = 0; i < edges; i++) {
            int src = in.nextInt();
            int dest = in.nextInt();
            if (g.containsKey(src)) {
                List <Integer> list = g.get(src);
                list.add(dest);
                g.put (src, list);
            }else {
                List <Integer> list = new ArrayList<>();
                list.add(dest);
                g.put (src, list);
            }
        }

        System.out.println ("Adjacency List Representation of the graph : ");
        PrintGraph();

        int src = 7, dest = 9;
        System.out.println ("Printing all possible paths from the source vertex " + src + " to the destination vertex " + dest + " : ");
        findPaths(src, dest);
        in.close();
    }

    public static void printPath (List <Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print (path.get(i) + " ");
        }
        System.out.println();
    }

    private static boolean isNotVisited (List<Integer> path, int value) {
        if (path.contains(value)) return false;
        else return true;
    }

    private static void findPaths (int src, int dest) {
        Queue <List<Integer>> queue = new LinkedList<>();
        List<Integer> path = new ArrayList<>();
        path.add(src);
        queue.add (path);

        while (!queue.isEmpty()) {
            path = queue.poll();
            int last = path.get(path.size()-1);
            if (last == dest) {
                printPath(path);
            }

            if (g.containsKey(last)) {
                List <Integer> listNodes = g.get(last);
                for (int i = 0; i < listNodes.size(); i++) {
                    int v = listNodes.get(i);
                    if (isNotVisited(path, v)) {
                        List <Integer> newPath = new ArrayList<>(path);
                        newPath.add(v);
                        queue.add(newPath);
                    }
                }
            }
        }
    }

    public static void PrintGraph () {
        for (Map.Entry <Integer, List<Integer>> o : g.entrySet()) {
            System.out.println (o.getKey() + " -> " + o.getValue());
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