import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.LinkedList;

public class LongArray {
    public static List <Integer> can (int n, int x, int[] ar, int Q, int[] pos) {
        List <Integer> lst = new LinkedList<>();
        List <Integer> res = new LinkedList<>();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < ar.length; j++) {
                lst.add(ar[j]);
            }
        }
        Collections.sort(lst);
        for (int i = 0; i < Q; i++) {
            res.add(lst.get(pos[i]-1));
        }
        return res;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] str = st.nextToken().split(" ");
        int n = Integer.parseInt (str[0]);
        int x = Integer.parseInt (str[1]);
        str = st.nextToken().split(" ");
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = Integer.parseInt (str[i]);
        }
        int Q = Integer.parseInt (st.nextToken());
        str = st.nextToken().split(" ");
        int[] pos = new int[Q];
        for (int i = 0; i < Q; i++) {
            pos[i] = Integer.parseInt (str[i]);
        }
        List <Integer> res = can(n, x, ar, Q, pos);
        for (int i = 0; i < res.size(); i++) {
            System.out.printf ("%d ", res.get(i));
        }
    }
}


/***
3
2
1 1 1
4
3 2 1 4
 */