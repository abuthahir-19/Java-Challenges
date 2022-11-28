import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class ZeroOneLosses {
    public List <List <Integer>> findWinners (int[][] matches) {
        Map <Integer, Integer> map = new HashMap<>();
        for (int[] match : matches) {
            map.putIfAbsent(match[0], 0);
            map.put (match[1], map.getOrDefault(match[1], 0) + 1);
        }
        System.out.println ("Result : ");
            for (Integer key : map.keySet()) {
                int value = map.get (key);
                System.out.println (key + " " + value);
            }

        List <List<Integer>> list = new ArrayList<>();
        return list;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int[][] matches = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                matches[i][j] = in.nextInt();
            }
        }
        ZeroOneLosses ob = new ZeroOneLosses();
        List <List<Integer>> ret = ob.findWinners(matches);
        for (List <Integer> arr : ret) {
            System.out.println (arr);
        }
        in.close();
    }
}

/**
4
2 3
1 3
5 4
6 4

10
1 3
2 3
3 6
5 6
5 7
4 5
4 8
4 9
10 4
10 9
 */