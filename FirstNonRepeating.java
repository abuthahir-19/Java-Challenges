import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FirstNonRepeating {
    public int getFirstCharIndex (String s) {
        HashMap <Character, Integer> count = new HashMap<>();
        int len = s.length();
        for (char c : s.toCharArray()) {
            if (count.containsKey(c)) {
                count.put(c, count.get(c) + 1);
            } else {
                count.put (c, 1);
            }
        }

        for (int i = 0; i < len; i++) {
            if (count.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }

    public char getFirstCharTwice (String s) {
        HashMap <Character, Integer> count = new HashMap<>();
        char ch = '0';
        for (char c : s.toCharArray()) {
            if (count.containsKey(c)) {
                int cnt = count.get (c) + 1;
                if (cnt == 2) {
                    ch =  c;
                    break;  
                }
                count.put (c, cnt);

            } else {
                count.put (c, 1);
            }
        }
        return ch;
    }

    public String getSortedString (String s) {
        PriorityQueue <Map.Entry <Character, Integer>> q = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        HashMap <Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) 
            count.put (c, count.getOrDefault(c, 0) + 1);

        for (Map.Entry<Character, Integer> m : count.entrySet()) {
            q.add (m);
        }
        
        StringBuilder sbf = new StringBuilder();
        while (!q.isEmpty()) {
            Map.Entry <Character, Integer> ele = q.remove();
            for (int i = 0; i < ele.getValue(); i++) {
                sbf.append(ele.getKey());
            }
        }
        return sbf.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        FirstNonRepeating ob = new FirstNonRepeating();
        // System.out.println (ob.getFirstCharIndex(s));
        // System.out.println (ob.getFirstCharTwice(s));
        System.out.println(ob.getSortedString(s));
        bf.close();
    }
}
