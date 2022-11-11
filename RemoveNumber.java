import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class RemoveNumber {
    public static int getMaxAfterRemove (int num, int dig) {
        String val = Integer.toString(num);
        int max = Integer.MIN_VALUE;
        List <Integer> idxes = new ArrayList<>();
        for (int i = 0; i < val.length(); i++) {
            int ch = Character.getNumericValue (val.charAt(i));
            if (ch == dig) idxes.add (i);
        }
        
        for (int idx : idxes) {
            String value = "";
            for (int i = 0; i < val.length(); i++) {
                if (i != idx) value += val.charAt(i);
            }
            int d = Integer.parseInt (value);
            if (d > max) max = d;
        }
        return max;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bf.readLine().split(" ");
        int num = Integer.parseInt (line[0]);
        int dig = Integer.parseInt (line[1]);
        System.out.println (getMaxAfterRemove(num, dig));
        bf.close();
    }
}
/**
1 3
2
 */