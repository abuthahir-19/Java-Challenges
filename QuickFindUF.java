import java.util.HashMap;
import java.util.Map;

public class QuickFindUF {
    private int id[];

    public QuickFindUF (int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    private int root (int i) {
        while (i != id[i]) i = id[i];
        return i;
    }

    public boolean connected (int p, int q) {
        return root (p) == root (q);
    }

    public void union (int p, int q) {
        // int pid = id[p];
        // int qid = id[q];
        // for (int i = 0; i < id.length; i++) {
        //     if (id[i] == pid) id[i] = qid;
        // }

        int i = root (p);
        int j = root (q);
        id[i] = j;
    }

    public static void main(String[] args) {
        QuickFindUF uf = new QuickFindUF(10);
        Map <String, String> data = new HashMap<>();
        data.put ("7904012835", "Abu");
        System.out.println (data.get("7904012834"));

    }

    public int hash (int key) {
        return key % 7;
    }
}

/*
3
0 1
0 2
1 2
 */