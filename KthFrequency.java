import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class KthFrequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int te = in.nextInt();
        while (te > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = in.nextInt();
            }
            Map <Integer, Integer> f = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (f.containsKey(ar[i])) {
                    f.put (ar[i], f.get(ar[i]) + 1);
                } else {
                    f.put (ar[i], 1);
                }
            }

            List <Integer> result = new ArrayList<>();
            for (Map.Entry <Integer, Integer> o : f.entrySet()) {
                if (o.getValue() > k) {
                    result.add(o.getKey());
                }
            }

            if (result.size() > 0) {
                for (int i = 0; i < result.size(); i++) {
                    System.out.println (result.get(i) + " ");
                }
                System.out.println();
            }else System.out.println("-1");
            
            te -= 1;
        }
    }
}
