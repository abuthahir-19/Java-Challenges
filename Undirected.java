import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Objects;
import java.util.ArrayList;

public class Undirected {
    static Map <Integer, List <Integer>> graph = new HashMap<>();
    static Map <Integer, Integer> id = new HashMap<>();
    static Map <Integer, Integer> size = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Undirected ob = new Undirected();
        String[] rnge = bf.readLine().split(" ");
        int v = Integer.parseInt (rnge[0]);
        int edg = Integer.parseInt (rnge[1]);

        for (int i = 0; i < edg; i++) {
            String[] line = bf.readLine().split(" ");
            int src = Integer.parseInt (line[0]);
            int dest = Integer.parseInt (line[1]);
            if (!id.containsKey(src)) id.put (src, Objects.hashCode(src));
            if (!id.containsKey(dest)) id.put (dest, Objects.hashCode(dest));

            if (!size.containsKey(src)) size.put (src, 1);
            if (!size.containsKey (dest)) size.put (dest, 1);
            addEdge(src, dest);
        }
        System.out.println ("Graph representation after construction : ");
        printGraph();

        if (ob.isCycle()) {
            System.out.println("Graph contains cycle !");
        } else {
            System.out.println ("Graph is\'nt contains cycle !!");
        }

        // System.out.println ("Size information of the given Graph : ");

        // for (Map.Entry <Integer, Integer> o : size.entrySet()) {
        //     System.out.println (o.getKey() + " " +  o.getValue());
        // }

        // System.out.println ("Identity Information : ");
        // printIDs();
    }

    public static void addEdge (int src, int dest) {
        List <Integer> list ;
        if (graph.containsKey(src)) {
            list = graph.get (src);
            list.add (dest);
        } else {
            list = new ArrayList<>();
            list.add (dest);
        }
        graph.put (src, list);
    }
    public static int root (int i) {
        while (id.get(i) != i) i = id.get(i);
        return i;
    }

    public static boolean isConnected (int p, int q) {
        return root(p) == root (q);
    }

    public static void union (int p, int q) {
        int i = id.get(p);
        int j = id.get(q);
        if (i == j) return ;
        else if (size.get(i) < size.get(j)) {
            id.put (i, j);
            size.put (j, size.getOrDefault(j, 0) + size.get(i));
        } else {
            id.put (j, i);
            size.put (i, size.getOrDefault(i, 0) + size.get(j));
        }
    }

    public boolean isCycle () {
        for (Map.Entry <Integer, List<Integer>> o : graph.entrySet()) {
            int p = o.getKey();
            List <Integer> lst = o.getValue();
            for (int val : lst) {
                if (isConnected(p, val)) {
                    return true;
                }
                else union(p, val);
            }
        }
        return false;
    }

    public static void printGraph () {
        for (Map.Entry <Integer, List<Integer>> o : graph.entrySet()) {
            System.out.println (o.getKey() + " => " + o.getValue());
        }
        System.out.println();
    }

    public static void printIDs() {
        for (Map.Entry <Integer, Integer> o : id.entrySet()) {
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