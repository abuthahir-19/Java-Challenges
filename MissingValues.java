import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MissingValues {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        List <Integer> arr = new ArrayList<>();
        List <Integer> brr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add (in.nextInt());
        }

        for (int i = 0; i < m; i++) {
            brr.add (in.nextInt());
        }
    }

    public static List <Integer> getMissingValues (List <Integer> arr, List <Integer> brr) {
        List <Integer> res = new ArrayList<>();
        Map <Integer, Integer> c1 = new HashMap<>();
        Map <Integer, Integer> c2 = new HashMap<>();
        for (int val : arr) c1.put (val, c1.getOrDefault(val, 0)+1);
        for (int val : brr) c2.put (val, c2.getOrDefault(val, 0)+1);

        for (Map.Entry <Integer, Integer> o : c2.entrySet()) {
            int value = o.getKey();
            int count = o.getValue();
            if (!c1.containsKey(value)) {
                res.add (value);
            }
            else if (c1.containsKey(value)) {
                if (c1.get(value) != count) {
                    res.add (value);
                }
            }
        }
        return res;
    }
}
