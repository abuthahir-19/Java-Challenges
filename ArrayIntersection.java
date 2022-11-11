import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;

public class ArrayIntersection {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = bf.readLine().split(" ");
        String[] line2 = bf.readLine().split(" ");
        int[] ar1 = new int[line1.length];
        int[] ar2 = new int[line2.length];
        for (int i = 0; i < line1.length; i++) {
            ar1[i] = Integer.parseInt (line1[i]);
        }

        for (int i = 0; i < line2.length; i++) {
            ar2[i] = Integer.parseInt (line2[i]);
        }

        int[] res = getIntersectionOfArrays (ar1, ar2);
        for (int val : res) {
            System.out.print (val + " ");
        }
        bf.close();
    }

    public static int[] getIntersectionOfArrays (int[] num1, int[] num2) {
        List <Integer> result = new ArrayList<>();
        Map <Integer, Integer> f1 = new HashMap<>();

        for (int i : num1) {
            if (f1.containsKey(i)) {
                int c = f1.get (i) + 1;
                f1.put (i, c);
            } else {
                f1.put (i, 1);
            }
        }
        for (int i = 0; i < num2.length; i++) {
            int value = num2[i];
            if (f1.containsKey (value)) {
                result.add(value);
                int count = f1.get (value)-1;
                if (count == 0) {
                    f1.remove (value);
                }else {
                    f1.put (value, count);
                }
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
