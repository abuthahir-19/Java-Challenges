import java.util.Scanner;

public class CeaserCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String str = in.next();
        int k = in.nextInt();
        System.out.println (Result.encoded(str, k));
        in.close();
    }
}

class Result {
    public static String encoded (String s, int k) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String encoded = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isAlphabetic(ch)) {
                if (Character.isUpperCase(ch)) {
                    char l = Character.toLowerCase(ch);
                    char u = Character.toUpperCase(alpha.charAt((alpha.indexOf(l) + k) % alpha.length()));
                    encoded += u;
                }
                else {
                    encoded += alpha.charAt((alpha.indexOf(ch) +k) % alpha.length());
                }
            }else encoded += ch;
        }
        return encoded;
    }
}

/**
11
middle-Outz
2
**/