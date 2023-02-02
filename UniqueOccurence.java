import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;

public class UniqueOccurence {
    public boolean getOccurence (int[] arr) {
        Map <Integer, Integer> o = new HashMap<>();
        List <Integer> count = new ArrayList<>();
        for (int i : arr) {
            o.put (i, o.getOrDefault(i, 0) + 1);
        }

        for (Integer value : o.values()) {
            if (!count.contains(value)) {
                count.add (value);
            } else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        in.close();
        UniqueOccurence ob = new UniqueOccurence();
        System.out.println (ob.getOccurence(ar));
    }
}

/**
6
1 2 2 1 1 3

2
1 2

10
-3 0 1 -3 1 1 1 -3 10 0
 */