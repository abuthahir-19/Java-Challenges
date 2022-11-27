import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Collections;

public class IceCream {
    public static List <Integer> getTwoIndexes (int m, List <Integer> arr) {
        Map <Integer, Integer> count = new HashMap<>();
        List <Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            int val = arr.get(i);
            if (count.containsKey(m - val)) {
                res.add (arr.indexOf(m - val)+1);
                res.add (i+1);
                Collections.sort (res);
                break;
            } else {
                count.put (val, count.getOrDefault(val, 0) + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test > 0) {
            int m = in.nextInt();
            int n = in.nextInt();
            List <Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add (in.nextInt());
            }
            System.out.println (getTwoIndexes(m, arr));
            test -= 1;
        }
        in.close();
    }
}
