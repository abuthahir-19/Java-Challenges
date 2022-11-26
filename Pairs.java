import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Pairs {
    int getPairCount (int k, List <Integer> arr) {
        Map <Integer, Integer> c = new HashMap<>();
        int count = 0;
        Collections.sort (arr);
        for (int i = 0; i < arr.size(); i++) {
            int value = arr.get (i);
            int diff = Math.abs (value - k);
            if (c.containsKey(diff)) {
                count += 1;
                c.put (value, c.getOrDefault(value, 0) + 1);
            } else {
                c.put (value, 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        Pairs ob = new Pairs();
        List <Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add (in.nextInt());
        }
        int result = ob.getPairCount (k, arr);

        System.out.println (result);
        in.close();
    }
}
