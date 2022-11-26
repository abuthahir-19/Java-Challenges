import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Pairs {
    int getPairCount (int k, List <Integer> arr) {
        Map <Integer, Integer> c = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            c.put (arr.get (i), c.getOrDefault(arr.get (i), 0) + 1);
        }
        
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int diff = Math.abs (arr.get(i) - k);
            if (c.containsKey(diff)) count += c.get (diff);
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
    }
}
