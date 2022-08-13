import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindReachability {
    static Map <Integer, ArrayList<Integer>> graph = new HashMap<>();

    public static void addEdge (int u, int v) {
        if (graph.containsKey(u)) {
            ArrayList<Integer> obj = graph.get(u);
            obj.add(v);
            graph.put (u, obj);
        }
        else {
            ArrayList<Integer> obj = new ArrayList<>();
            obj.add(v);
            graph.put(u, obj);
        }
    }

    public static boolean checkReachablitiy (int A, int B) {
        if (graph.containsKey(A)) {
            if (graph.get(A).contains(B)) return true;
            else {
                ArrayList<Integer> lst = graph.get(A);
                for (int key : lst) {
                    if (graph.containsKey(key)) {
                        if (graph.get(key).contains(B)) return true;
                    }
                }
            }
        }
        return false;
    }

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
            addEdge(u, v);
        }
        int A = in.nextInt();
        int B = in.nextInt();
        if (checkReachablitiy(A, B)) {
            System.out.print ("1");
        }
        else System.out.print ("0");
        in.close();
    }
}