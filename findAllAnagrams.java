import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class findAllAnagrams {
    public static List <Integer> findAnagrams (String s, String p) {
        List <Integer> idxs = new ArrayList<>();
        char[] temp = p.toCharArray();
        Arrays.sort (temp);
        p = new String(temp);
        int len = p.length();
        for (int i = 0; i < s.length() && ((s.length()-i) >= p.length()); i++) {
            String subs = s.substring(i, len);
            char[] t = subs.toCharArray();
            Arrays.sort (t);
            subs = new String (t);
            if (subs.equals(p)) idxs.add (i);
            len += 1;
        }
        return idxs;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String p = in.next();
        List <Integer> anagrams = findAnagrams (s, p);
        System.out.println (anagrams); 
        in.close();
    }
}