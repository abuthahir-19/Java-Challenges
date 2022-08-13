import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LeastOccDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] ar = in.nextLine().split(" ");
        Map <Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < ar.length; i++) {
            int value = Integer.parseInt(ar[i]);
            while (value != 0) {
                int rem = value % 10;
                if (count.containsKey(rem)) {
                    int c = count.get(rem) + 1;
                    count.put(rem, c);
                }else {
                    count.put (rem, 1);
                }
                value /= 10;
            }
        }
        int min = Collections.min(count.values());
        for (Map.Entry <Integer, Integer> map : count.entrySet()) {
            if (map.getValue() == min)
                System.out.printf ("%d ", map.getKey());
        }
        in.close();
    }
}
/**
35 81 78 84 53

12 21 68 55 71 29 60 879
**/