import java.util.ArrayList;
import java.util.Scanner;

public class MergeStrings {
    private static String ConcatStringByChar(String key, String value) {
        String res = "";
        int keyLength = key.length();
        int valLength = value.length();
        int len = keyLength > valLength ? keyLength : valLength;

        for (int i = 0; i < len; i++) {
            if (i < keyLength)
            res += key.charAt(i);
            if (i < valLength)
            res += value.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList <String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String key = in.next();
            String value = in.next();
            String merged = ConcatStringByChar (key, value);
            result.add (merged);
        }
        System.out.println ("Output : ");
        for (String value : result) {
            System.out.println (value);
        }
        in.close();
    }
}

/**
2
good bye
take care


3
cool buddy
think well
welcome tin
**/