import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Modal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map <Integer, Integer> f = new HashMap<>();

        for (int i = 0; i < n; i+=1) {
            int val = in.nextInt();
            if (f.containsKey(val)) {
                f.put (val, f.get(val) + 1);
            }
            else f.put (val, 1);
        }

        int maxKey = Integer.MIN_VALUE;
        int maxValue = -1;
        for (Map.Entry <Integer, Integer> o : f.entrySet()) {
            int key = o.getKey(), value = o.getValue();
            if (value > maxKey) {
                maxKey = value;
                maxValue = key;
            }
            // System.out.println(key + " " + value);
        }
        System.out.println(maxValue);
        in.close();
    }
}
