import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SumAsPerFrequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List <Integer> list = new ArrayList<>();
        Map <Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < n; i += 1) {
            int key = in.nextInt();
            list.add(key);
            if (count.containsKey(key)) {
                count.put(key, count.get(key) + 1);
            }else count.put(key, 1);
        }
        
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int s = in.nextInt();
            int e = in.nextInt();
            int sum = 0;
            for (Map.Entry <Integer, Integer> o : count.entrySet()) {
                int v = o.getValue();
                if (v >= s && v <= e) sum += (o.getKey()*v);
            }
            System.out.println(i + " -> " + sum);
        }

        
        in.close();
    }
}

/**
8
4 4 6 5 3 3 3 9
4
1 4
2 7
3 7
5 6
**/
