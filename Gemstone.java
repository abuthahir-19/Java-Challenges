import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.List;

public class Gemstone {
    public static int getGemstoneCount (List <String> arr) {
        Set <Character> st = new HashSet<>();
        int count = 0;
        for (char c : arr.get (0).toCharArray()) {
            boolean present = true;
            if (!st.contains(c)) {
                for (int i = 1; i < arr.size(); i++) {
                    if (!arr.get(i).contains(c+"")) {
                        present = false;
                        break;
                    }
                }
                if (present) {
                    count += 1;
                    st.add (c);
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List <String> inputs = new ArrayList<>();
        while (n > 0) {
            String str = in.next();
            inputs.add (str);
            n-= 1;
        }
    }
}
