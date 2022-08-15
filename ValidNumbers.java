import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidNumbers {
    private static String getReversed (String s) {
        StringBuilder sbf = new StringBuilder();
        sbf.append(s);
        sbf.reverse();
        return sbf.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        Map <Integer, Integer> c = new HashMap<>();
        c.put (0, 0);
        c.put (1, 1);
        c.put (6, 9);
        c.put (8, 8);
        c.put (9, 6);

        for (int i = 1; i <= n; i++) {
            String s = Integer.toString (i);
            boolean validity = true;
            String rotated = "";
            int res;
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                int v = Integer.parseInt(ch+"");
                rotated += c.get(v) + "";
                if (!c.containsKey (v)) {
                    validity = false;
                    break;
                }
            }
            if (validity) {
                res = Integer.parseInt(getReversed(rotated));
                if (res != i) count += 1;
            }
        }
        System.out.println (count);
        in.close();
    }
}
