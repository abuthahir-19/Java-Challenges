import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LongestPrefix {
    static String getLongestPrefix (String[] input) {
        String result = "";
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < input.length; i++) {
            if (input[i].length() < min)
                min = input[i].length();
        }
        System.out.println(min);
        for (int i = 0; i < min; i++) {
            List <Character> chars = new ArrayList<>();
            for (String str : input) {
                if (str.length() != 0) {
                    char ch = str.charAt(i);
                    if (!chars.contains(ch))
                        chars.add (str.charAt(i));
                }
            } 
            if (chars.size() == 1) result += chars.get(0);
            else break;
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bf.readLine().split(" ");
        System.out.println (getLongestPrefix(line));
        bf.close();
    }
}
