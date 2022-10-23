import java.util.HashMap;
import java.util.Scanner;

public class RomanToInt {
    public static int getIntFromRoman (String s) {
        HashMap <Character, Integer> roman = new HashMap<>();
        roman.put ('I', 1);
        roman.put ('V', 5);
        roman.put ('X', 10);
        roman.put ('L', 50);
        roman.put ('C', 100);
        roman.put ('D', 500);
        roman.put ('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //if the character is I then check whether it contains a V and X after to it

            if (ch == 'I') {
                
            }

            //if the character is X then search for L and C


            //if the character is C then search for D and M
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(getIntFromRoman(s));
        in.close();
    }
}
