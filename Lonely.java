import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Lonely {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add (in.nextInt());
        int unique = getLonelyInteger (list);
        System.out.println (unique);
        in.close();
    }

    public static int getLonelyInteger (List <Integer> list) {
        HashMap <Integer, Integer> f = new HashMap<>();
        int res = 0;
        for (int val : list) {
            f.put (val, f.getOrDefault(val, 0) + 1);
        }

        for (HashMap.Entry <Integer, Integer> o : f.entrySet()) {
            if (o.getValue() == 1) {
                res = o.getKey();
                break;
            }
        }
        return res;
    }
}
