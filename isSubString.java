import java.util.Scanner;

public class isSubString {
    private static int checkSubString (String str1, String str2) {
        int start = 0;
        int index = -1;
        int len = str1.length();
        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) == str2.charAt(start) && start < str2.length()) {
                if (start == 0) index = i;
                start++;
            }else {
                if (start == str2.length()) return index;
                start = 0;
                index = -1;
            }
        }
        if (start == str2.length()) return index;
        else return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();

        System.out.println (checkSubString(str1, str2));
        in.close();
    }
}

/**
test123string
123


testing12
1234
***/