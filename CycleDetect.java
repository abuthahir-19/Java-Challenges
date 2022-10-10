import java.util.Map;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class CycleDetect {
    static Map <Integer, List<Integer>> g = new HashMap<>();
    
    public static void addEdge (int src, int dest) {
        List <Integer> list;
        if (g.containsKey(src)) {
            list = g.get(src);
            list.add(dest);
            g.put (src, list);
        } else {
            list = new ArrayList<>();
            list.add (dest);
            g.put (src, list);
        }
    }

    public static boolean detectCycle (List <Integer> eles) {
        for (int i = 0; i < eles.size(); i++) {
            int start = eles.get(i);
            if (g.containsKey(start)) {
                if (g.get(start).contains(start)) {
                    return true;
                }
                else {
                    List <Integer> values = g.get(start);
                    for (int j = 0; j < values.size(); j++) {
                        int v = values.get(j);
                        if (g.containsKey(v)) {
                            if (g.get(v).contains(start)) return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int edges = in.nextInt();
        List <Integer> l = new ArrayList<>();
        for (int i = 0; i < edges; i++) {
            int src = in.nextInt();
            int dest = in.nextInt();
            l.add(src);
            l.add(dest);
            addEdge(src, dest);
        }

        if (detectCycle(l)) {
            System.out.println ("Given graph contains cycle !!");
        } else {
            System.out.println ("Given graph is not a cyclic !!");
        }

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

4
0 1
0 2
1 2
2 3
 */