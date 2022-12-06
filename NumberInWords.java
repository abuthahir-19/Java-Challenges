import java.util.Scanner;

public class NumberInWords {
    public static String getString (char c) {
        if (c == '0') return "zero";
        else if (c == '1') return "one";
        else if (c == '2') return "two";
        else if (c == '3') return "three";
        else if (c == '4') return "four";
        else if (c == '5') return "five";
        else if (c == '6') return "six";
        else if (c == '7') return "seven";
        else if (c == '8') return "eight";
        else return "nine";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        for (int i = 0; i < n.length(); i++) {
            System.out.print (getString (n.charAt(i)) + " ");
        }
        in.close();
    }
}