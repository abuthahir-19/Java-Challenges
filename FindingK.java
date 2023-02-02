import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FindingK {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt (bf.readLine());
        while (test > 0) {
            String[] line = bf.readLine().split(" ");
            List <Integer> list = new ArrayList<>();
            for (String val : line) {
                list.add (Integer.parseInt (val));
            }
            int k = 2;
            while (k < 100 && isDivisible (list, k)) {
                k += 1;
            }
            System.out.println (k);
            test -= 1;
        }
        bf.close();
    }

    public static boolean isDivisible (List <Integer> list, int k) {
        for (int val : list) {
            if (val % k == 0) return true;
        }
        return false;
    }
}
