import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Objects;
import java.util.List;

public class Krushkal {
    static Map <Integer, List <Integer>> graph = new HashMap<>();
    static Map <Integer, Integer> id = new HashMap<>();
    static Map <Integer, Integer> size = new HashMap<>();

    public void initializeWithDefault (List <Integer> list) {
        int len = list.size();
        for (int i = 0; i < len; i++) {
            int val = list.get(i);
            id.put (val, Objects.hashCode(val));
            size.put (val, 1);
        }
    }

    public static int root (int i) {
        while (i != id.get(i)) i = id.get(i);
        return i;
    }

    public static boolean isConnected (int p, int q) {
        return root (p) == root (q);
    }

    public static void union (int p, int q) {
        int i = id.get(p);
        int j = id.get(q);
        if (i == j) return ;

        if (size.get (i) < size.get(j)) {
            id.put (i, j);
            size.put (j, size.getOrDefault(j, 0) + size.get(i));
        } else {
            id.put (j, i);
            size.put (i, size.getOrDefault(i, 0) + size.get(j));
        }
    }

    public boolean isCycleExist () {
        for (Map.Entry <Integer, List <Integer>> o : graph.entrySet()) {
            int k = o.getKey();
            for (int val : o.getValue()) {
                if (isConnected(k, val)) return true;
                else union (k, val);
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Krushkal ob = new Krushkal();
        List <Integer> vertexes = new ArrayList<>();
        int v = in.nextInt();
        int edge = in.nextInt();
        for (int i = 0; i < edge; i++) {
            int src = in.nextInt();
            int dest = in.nextInt();
            if (!vertexes.contains(src)) vertexes.add (src);
            if (!vertexes.contains(dest)) vertexes.add (dest);
            addEdge (src, dest);
        }

        ob.initializeWithDefault(vertexes);
        System.out.println ("Graph Representation : ");
        ob.printGraph();

        if (ob.isCycleExist())
            System.out.println ("The graph contains cycle !");
        else System.out.println ("The graph is\'nt contains cycle !!");
        in.close();
    }

    public static void addEdge (int src, int dest) {
        List <Integer> list;
        if (graph.containsKey(src)) {
            list = graph.get (src);
            list.add (dest);
        }
        else {
            list = new ArrayList<>();
            list.add (dest);
        }
        graph.put (src, list);
    }

    public void printGraph () {
        for (Map.Entry <Integer, List <Integer>> o : graph.entrySet()) {
            System.out.println (o.getKey() + " => " + o.getValue());
        }
        System.out.println();
    }
}

/**
5 14
0 1
0 4
1 0
1 2
1 3
1 4
2 1
2 3
3 1
3 2
3 4
4 0
4 1
4 3

5 4
0 1
0 4
1 2
2 3

5 5
0 1
0 4
1 2
2 3
3 4

3 2
0 1
1 2

4 3
8 3
3 4
4 9
9 8

4 4
8 3
3 4
4 9
9 8
*/