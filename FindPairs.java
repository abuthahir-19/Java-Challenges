import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

class Pair {
    int first, second;
    public Pair (int f, int s) {
        this.first = f;
        this.second = s;
    }
}

public class FindPairs {
    public static List <Integer> closestNumbers (List <Integer> arr) {
        List <Integer> result = new ArrayList<>();
        List <Integer> diffList = new ArrayList<>();
        Map <Integer, List<Pair>> map = new HashMap<>();

        Collections.sort (arr);
        int n = arr.size(), min;
        for (int i = 0; i < n-1; i++) {
            int f = arr.get (i);
            int s = arr.get (i+1);
            int diff = Math.abs (f-s);
            diffList.add (diff);
            Pair pair = new Pair (f, s);
            List <Pair> lst = new ArrayList<>();

            if (map.containsKey(diff)) {
                lst = map.get (diff);
                lst.add (pair);
            } else {
                lst.add (pair);
            }
            map.put (diff, lst);
        }

        min = Collections.min(diffList);
        for (Integer key : map.keySet()) {
            if (key == min) {
                for (Pair obj : map.get (key)) {
                    result.add (obj.first);
                    result.add (obj.second);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        List <Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add (in.nextInt());
        }
        System.out.println (closestNumbers(arr));
        in.close();
    }
}
