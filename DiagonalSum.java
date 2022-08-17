import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.Map;

class Result {

}
public class DiagonalSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List <Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add (in.nextInt());
        }
        Map <Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr.get(i);
            if (count.containsKey(key)) {
                int c = count.get(key) + 1;
                count.put (key, c);
            }else count.put (key, 1);
        }

        for (Map.Entry <Integer, Integer> o : count.entrySet()) {
            int value = o.getValue();
            if (value == 1) {
                System.out.print (o.getKey());
                break;
            }
        }
        in.close();
    }
}

/**
3
11 2 4
4 5 6
10 8 -12
**/