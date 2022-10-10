import java.util.Map;
import java.util.Queue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;;

public class GraphDFS {
    static Map <Integer, List <Integer>> g = new HashMap<>();
    static Map <Integer, Boolean> visited = new HashMap<>();

    public static void addEdge (int src, int dest) {
        if (g.containsKey(src)) {
            List <Integer> list = g.get(src);
            list.add(dest);
            g.put (src, list);
        } else {
            List <Integer> list = new ArrayList<>();
            list.add(dest);
            g.put (src, list);
        }
    }

    public static void initialize (List <Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int k = list.get(i);
            if (visited.containsKey(k)) {
                if (visited.get(k) == true) visited.put (k, false);
            }
            else {
                visited.put (k, false);
            }
        }
    }

    private static void DFSUtil (int v, Map<Integer, Boolean> visited) {
        visited.put (v, true);
        System.out.print (v + " ");
        Iterator <Integer> i = g.get(v).listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited.get(n)) 
                DFSUtil(n, visited);
        }
    }

    public static void DFS (int start) {
        DFSUtil(start, visited);
    }

    public static void BFS (int start) {
        Queue <Integer> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            int s = queue.poll();
            visited.put (s, true);
            System.out.print (s + " ");
            Iterator<Integer> i = g.get(s).listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited.get(n)) {
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            int src = in.nextInt();
            int dest = in.nextInt();
            list.add(src);
            list.add(dest);
            addEdge(src, dest);
        }

        initialize(list);
        System.out.println("DFS Traversal of the given graph starting from vertex 2 : ");
        DFS(2);


        initialize(list);
        System.out.println();


        System.out.println("BFS Traversal of the givn graph starting from vertex 2 : ");
        BFS(2);
        in.close();
    }
}

/**
6
0 1
0 2
1 2
2 0
2 3
3 3
 */