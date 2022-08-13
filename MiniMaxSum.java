import java.util.*;
import java.util.LinkedList;

public class MiniMaxSum {
    public static void miniMaxSum (List<Integer> arr) {
        List<Long> added = new LinkedList<>();

        for (int i = 0; i < arr.size(); i++) {
            long sum = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (i != j) {
                    sum += arr.get(j);
                }
            }
            added.add(sum);
        }
        System.out.println (Collections.min(added) + " " + Collections.max (added));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List <Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        miniMaxSum (list);
        in.close();
    }
}
