import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Result {
    public static List <Integer> countingSort (List <Integer> arr) {
        List <Integer> result = new ArrayList<>();
        Map <Integer, Integer> count = new HashMap<>();
        int max = Collections.max(arr);
        for (int i = 0; i < arr.size(); i++) {
            int key = arr.get(i);
            if (count.containsKey(key)) {
                int c = count.get(key) + 1;
                count.put (key, c);
            }else count.put (key, 1);
        }
        for (int i = 0; i < max; i++) {
            if (count.containsKey(i))
            result.add(count.get(i));
            else result.add(0);
        }
        return result;
    }
}
public class ComparisonSorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add (in.nextInt());
        }
        for (int value : Result.countingSort(list)) {
            System.out.print (value + " ");
        }
    }
}

/**
5
1 1 3 2 1
**/