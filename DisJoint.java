import java.util.Scanner;

public class DisJoint {
    int v, e;
    Edge edge[];

    class Edge {
        int src, dest;
    }

    DisJoint (int v, int ed) {
        this.v = v;
        this.e = ed;
        edge = new Edge[e];
        for (int i = 0; i < e; i++) {
            edge[i] = new Edge();
        }
    }

    int find (int parent[], int i) {
        if (parent[i] == i) return i;
        return find (parent, parent[i]);
    }

    void union (int parent[], int x, int y) {
        parent[x] = y;
    }

    int isCycle (DisJoint graph) {
        int parent[] = new int[graph.v];
        for (int i = 0; i < graph.v; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < graph.e; i++) {
            int x = graph.find(parent, graph.edge[i].src);
            int y = graph.find(parent, graph.edge[i].dest);

            if (x == y) return 1;
            graph.union(parent, x, y);
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int ed = in.nextInt();
        DisJoint ob = new DisJoint(v, ed);
        for (int i = 0; i < ed; i++) {
            ob.edge[i].src = in.nextInt ();
            ob.edge[i].dest = in.nextInt ();
        }

        if (ob.isCycle(ob) == 1) 
            System.out.println ("Graph contains cycle !");

        else System.out.println ("Graph is\'nt contains cycle !!");
        in.close();
    }
}

/**
5 5
0 1
0 4
1 2
1 3
4 3

5 5
0 1
0 4
1 0
1 2
2 3

5 4
1 3
3 0
0 2
2 4
*/