import java.util.*;

public class OrderlyQueue {
    public static String getLexicalSmallString (String str, int k) {
        String res = str;
        if (k == 1) {
            int len = str.length();
            for (int i = 0; i < len; i++) {
                char c = str.charAt(0);
                str = str.substring(1, len) + c;
                if (str.compareTo(res) < 0) res = str; 
            }
            return res;
        }
        char[] temp = res.toCharArray();
        Arrays.sort (temp);
        return new String (temp);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int k = in.nextInt();
        System.out.println (getLexicalSmallString(str, k));
        in.close();
    }
}