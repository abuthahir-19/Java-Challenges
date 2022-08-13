import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
        int res = findShortTimePath (A, B);
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

    private static int findShortTimePath (int start, int dest) {
        if (map.containsKey(start)) {
            int dist = Integer.MAX_VALUE;
            ArrayList<EdgeNode> lst = map.get(start);
            for (EdgeNode value : lst) {
                int sum = 0;
                if (value.v == dest) {
                    if (dist > value.time) {
                        dist = value.time;
                    }
                }else {
                    sum += value.time;
                }
            }
        }
        return 0;
    }
}