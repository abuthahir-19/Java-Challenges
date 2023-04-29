import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class PassingMark {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt (bf.readLine());
        while (test-- > 0) {
            String[] line = bf.readLine().split(" ");
            int n = Integer.parseInt (line[0]);
            int x = Integer.parseInt (line[1]);
            String[] a = bf.readLine().split(" ");
            List <Integer> ar = new ArrayList<>();
            for (int i = 0; i < a.length; i++) {
                ar.add (Integer.parseInt (a[i]));
            }
            Collections.sort (ar);
            if (x == n) {
                System.out.println (Collections.min(ar) - 1);
            }
            else if (x == 1) {
                System.out.println (Collections.max (ar) - 1);
            } else {
                System.out.println (ar.get (n - x) - 1);
            }
        }
        bf.close();
    }
}
