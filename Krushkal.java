import java.io.*;
import java.util.Map;
import java.util.HashMap;

class Pair {
    int src, dest;
    Pair (int src, int dest) {
        this.src = src;
        this.dest = dest;
    }
}

public class Krushkal {
    static Map <Integer, Pair> graph = new HashMap<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bf.readLine().split(" ");
        int v = Integer.parseInt (line[0]);
        int edg = Integer.parseInt (line[1]);
        for (int i = 0; i < edg; i++) {
            String[] data = bf.readLine().split(" ");
            int src = Integer.parseInt (data[0]);
            int dest = Integer.parseInt (data[1]);
            int wieght = Integer.parseInt (data[2]);
            Pair ob = new Pair(src, dest);
            ob.src = src;
            ob.dest = dest;
            graph.put (wieght, ob);
        }

        System.out.println ("Printing the information of the graph with its Data : ");
        printGraphData ();
    }

    static void printGraphData () {
        for (Map.Entry <Integer, Pair> o : graph.entrySet()) 
            System.out.println (o.getKey() + " => [" + o.getValue().src + ", " + o.getValue().dest + "]");
    }
}

/*
9 14
7 6 1
8 2 2
6 5 2
0 1 4
2 5 4
8 6 6
2 3 7
7 8 7
0 7 8
1 2 8
3 4 9
5 4 10
1 7 11
3 5 14
 */