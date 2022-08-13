import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String val = "";
            int j = i+1; 
            while (j < str.length()) {
                if (Character.isDigit(str.charAt(j))) {
                    val += str.charAt(j);
                }else break;
                j++;
                i++;
            }
            printCharValTimes (ch, Integer.parseInt(val));
        }
        in.close();
    }

    private static void printCharValTimes(char ch, int val) {
        for (int i = 0; i < val; i++) {
            System.out.print (ch + "");
        }
    }
}

/***
a1b10

b3c6d15
 */