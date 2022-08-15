import java.util.Arrays;
import java.util.Scanner;

public class WordReverse {
    private static String getReversed (String[] s) {
        StringBuilder sbf = new StringBuilder();
        for (String word : s) {
            sbf.append(word);
        }
        // sbf.reverse();
        return sbf.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split(" ");
        // int len = str.length;
        // int e = len-1;
        // for (int i = 0; i < len / 2; i++) {
        //     String t = str[i];
        //     str[i] = str[e];
        //     str[e] = t;
        // }
        // String res = Arrays.toString(str);
        // System.out.println (res);


        System.out.println(getReversed(str));

        in.close();
    }
}
