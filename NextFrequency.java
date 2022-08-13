import java.util.HashMap;
import java.util.Scanner;

public class NextFrequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = in.nextInt();
            if (map.containsKey(value)) {
                int c = map.get(value) + 1;
                map.put (value, c);
            }
            else map.put (value, 1);
        }

        for (HashMap.Entry <Integer, Integer> obj : map.entrySet()) {
            System.out.println (obj.getKey() + " -> " + obj.getValue());
        }
    }
}
/**
7
1 1 2 3 4 2 1 
**/