import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunnyString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println (isFunny(s));
        in.close();
    }

    public static String isFunny (String s) {
        List <Integer> value1 = new ArrayList<>();
        List <Integer> value2 = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (i+1 < s.length()) {
                int c1 = s.charAt(i);
                int c2 = s.charAt(i+1);
                value1.add ((int) Math.abs (c1 - c2));
            }

            int last = s.length() - 1 - i;
            if (last - 1 > 0) {
                int v1 = s.charAt(last);
                int v2 = s.charAt(last-1);
                value2.add ((int) Math.abs (v1 - v2));
            }
        }

        for (int i = 0; i < value1.size(); i++) {
            if (value1.get(i) != value2.get(i)) {
                return "Not Funny";
            }
        }
        return "Funny";
    }
}
