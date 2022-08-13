import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        if (CheckAnagram(str1, str2)) {
            System.out.println ("Anagrams");
        }
        else System.out.println ("Not Anagrams");
        in.close();
    }

    private static boolean CheckAnagram (String str1, String str2) {
        Map <Character, Integer> freq1 = new HashMap<>();
        Map <Character, Integer> freq2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch = Character.toLowerCase (str1.charAt(i));
            if (freq1.containsKey(ch)) {
                freq1.put (ch, freq1.get(ch) + 1);
            }
            else freq1.put (ch, 1);
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = Character.toLowerCase (str2.charAt(i));
            if (freq2.containsKey(ch)) {
                freq2.put (ch, freq2.get(ch) + 1);
            }
            else freq2.put (ch, 1);
        }

        // System.out.println(freq1 + "\n" + freq2);

        for (Map.Entry<Character, Integer> f : freq1.entrySet()) {
            char key = f.getKey();
            int value = f.getValue();
            if (freq2.containsKey(key)) {
                if (freq2.get(key) != value) {
                    return false;
                }
            }
            else return false;
        }

        for (Map.Entry<Character, Integer> f : freq2.entrySet()) {
            char key = f.getKey();
            int value = f.getValue();
            if (freq1.containsKey(key)) {
                if (freq1.get(key) != value) {
                    return false;
                }
            }
            else return false;
        }

        return true;
    }
}
