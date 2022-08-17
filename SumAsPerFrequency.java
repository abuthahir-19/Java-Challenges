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

        for (int i = 0; i < n; i++) {
            int key = in.nextInt();
            list.add(key);
            if (count.containsKey(key)) {
                int c = count.get(key) + 1;
                count.put (key, c);
            }
            else count.put (key, 1);
        }
        
        int query = in.nextInt();
        for (int i = 0; i < query; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            int sum = 0;
            for (int j = 0; j < n; j++) {
                int c = count.get(list.get(j));
                if (c >= start && c <= end) {
                    sum += list.get (j);
                }
            }
            System.out.println (sum);
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
