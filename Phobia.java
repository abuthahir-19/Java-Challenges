import java.util.Scanner;

public class Phobia {
    private static boolean numIncludes17 (int value) {
        String str = Integer.toString(value);
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == '1' && str.charAt(i+1) == '7') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            if (val == 17 || numIncludes17(val) || val % 17 == 0) {
                System.out.println ("Panic Attack");
            }
            else {
                System.out.println("Happy Face");
            }
        }
        in.close();
    }
}