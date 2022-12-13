import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String s = in.next();
        int x = in.nextInt();
        char c = (char) ((char) 96 + x);
        Map <Character, Integer> occurence = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            occurence.put (ch, occurence.getOrDefault(ch, 0) + 1);
        }

        if (occurence.getOrDefault(c, 0) >= 1) {
            System.out.println ("yes");
        } else {
            System.out.println ("no");
        }
        in.close();
    }
}
