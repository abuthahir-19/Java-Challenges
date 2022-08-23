import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FindFollowerID {
    static Map <Integer, List<Integer>> g = new HashMap<>();
    private static List <Integer> ID = new ArrayList<>();

    public static void addEdge (int u, int v) {
        if (g.containsKey(u)) {
            List <Integer> values = g.get(u);
            values.add(v);
            g.put (u, values);
        }
        else {
            List <Integer> values = new ArrayList<>();
            values.add(v);
            g.put(u, values);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List <Integer> members = new ArrayList<>();
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
        FindIDsOfB(A, B);;
        for (int value : ID) {
            System.out.print (value + " ");
        }
        in.close();
    }

    public static void FindIDsOfB (int A, int B) {
        for (Map.Entry <Integer, List<Integer>> o : g.entrySet()) {
            List <Integer> followers = o.getValue();

            if (followers.contains(B)) {
                ID.add(o.getKey());
            }
            else {
                for (int follower : followers) {
                    if (g.containsKey(follower))
                        if (g.get(follower).contains(B)) ID.add(follower);
                }
            }
        }
    }
}

/**
4
2
5
7
9
4
2 9
7 2
7 9
9 5
7
9
**/