import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

class DistMarker {
    int dest;
    int dist;
    public DistMarker (int dest, int dist) {
        this.dest = dest;
        this.dist = dist;
    }
}

public class Dijkstra {
    static Map <Integer, List <DistMarker>> graph = new HashMap<>();
    static Map <Integer, Integer> dist = new HashMap<>();
    static Map <Integer, Boolean> sptSet = new HashMap<>();
    static int v;

    public static void initializeVertex (int src) {
        if (!dist.containsKey(src)) 
            dist.put (src, Integer.MAX_VALUE);
        if (!sptSet.containsKey(src)) 
            sptSet.put (src, false);
    }

    public static int getMinDistVertex () {
        int minDistVertx = Integer.MAX_VALUE, min = Integer.MAX_VALUE;
        for (Map.Entry <Integer, Boolean> o : sptSet.entrySet()) {
            boolean val = o.getValue();
            int keyDist = dist.get(o.getKey());
            if (!val && keyDist <= min) {
                min = keyDist;
                minDistVertx = o.getKey();
            }
        }
        return minDistVertx;
    }

    public static void dijkstra (int src) {
        dist.put (src, 0);

        for (int i = 0; i < v-1; i++) {
            int minVertex = getMinDistVertex();
            sptSet.put (minVertex, true);
            if (graph.containsKey (minVertex)) {
                Iterator <DistMarker> itr = graph.get(minVertex).listIterator();
                while (itr.hasNext()) {
                    DistMarker node = itr.next();
                    int newDist = node.dist + dist.get(minVertex);
                    if (newDist <= dist.get(node.dest))
                        dist.put (node.dest, newDist);
                }
            }
        }
    }

    public static void addEdgeWithDist (int src, DistMarker obj) {
        List <DistMarker> list;
        if (graph.containsKey(src)) {
            list = graph.get(src);
            list.add(obj);
        } else {
            list = new ArrayList<>();
            list.add (obj);
        }
        graph.put (src, list);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println ("Enter the number of vertex and edges : ");
        
        String[] line = bf.readLine().split(" ");
        v = Integer.parseInt(line[0]);
        int ed = Integer.parseInt(line[1]);

        System.out.println ("Enter the vertex and its dist from source : ");

        for (int i = 0; i < ed; i++) {
            String[] p = bf.readLine().split(" ");
            int src = Integer.parseInt(p[0]);
            int dest = Integer.parseInt(p[1]);
            int dist = Integer.parseInt (p[2]);
            initializeVertex(src);
            initializeVertex(dest);
            DistMarker obj = new DistMarker(dest, dist);
            addEdgeWithDist(src, obj);
        }

        dijkstra(7);

        System.out.println ("The shortest distance from the given source node 0 is : ");
        for (Map.Entry <Integer, Integer> o : dist.entrySet()) {
            System.out.println (o.getKey() + " => " + o.getValue());
        }
    }
}


/**
4 4
2 9 2
7 2 3
7 9 7
9 5 1


9 27
0 1 4
0 7 8
1 0 4
1 7 11
1 2 8
2 1 8
2 3 7
2 8 2
2 5 4
3 2 7
3 4 9
3 5 14
4 3 9
4 5 10
5 2 4
5 3 14
5 4 10
6 5 2
6 7 1
6 8 6
7 0 8
7 1 11
7 6 1
7 8 7
8 6 6
8 7 7
8 2 2
**/