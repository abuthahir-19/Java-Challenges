import java.util.Scanner;

public class PlayFairCipher {
    public static void generateKeyTable (char[] key, char[][] keyT) {
        int dict[] = new int[26];
        int row = 0, col = 0;
        for (int i = 0; i < key.length; i++) {
            if (key[i] == 'j') keyT[row][col++] = 'i';
            if (key[i] != 'j' && dict[key[i] - 97] == 0) {
                keyT[row][col++] = key[i];
            }
            dict[key[i] - 97] = 1;
            if (row >= 5) break;
            if (col >= 5) {
                col = 0;
                row += 1;
            }
        }

        for (int i = 0; i < 26; i++) {
            char ch = (char) ((char) i + 97);
            if (ch != 'j' && dict[i] == 0) {
                keyT[row][col++] = ch;
            }
            dict[i] = 1;
            if (row >= 5) break;
            if (col >= 5) {
                col = 0;
                row += 1;
            }
        }
    }

    public static String prepareText (String plain) {
        String newText = "";
        for (int i = 0; i < plain.length(); i++) {
            char ch = plain.charAt(i);
            if (newText.length() == 0) {
                newText += ch;
            }
            else if (newText.charAt(newText.length()-1) == ch) {
                newText += "x";
                newText += ch;
            } else {
                newText += ch;
            }
        }

        if (newText.length() % 2 != 0) {
            newText += 'z';
        }
        return newText;
    }

    public static char[] search (char a, char b, char[][] keyT, boolean toEncrypt) {
        char[] ret = new char[2];
        int r1, r2, c1, c2;
        r1 = r2 = c2 = c1 = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (keyT[i][j] == a) {
                    r1 = i;
                    c1 = j;
                }

                if (keyT[i][j] == b) {
                    r2 = i;
                    c2 = j;
                }
            }
        }

        if (toEncrypt) {
            if (c1 == c2) {
                r1 = (r1 + 1) % 5;
                r2 = (r2 + 1) % 5;
                ret[0] = keyT[r1][c1];
                ret[1] = keyT[r2][c2];

            } else if (r1 == r2) {
                c1 = (c1 + 1) % 5;
                c2 = (c2 + 1) % 5;

                ret[0] = keyT[r1][c1];
                ret[1] = keyT[r2][c2];
            } else {
                ret[0] = keyT[r1][c2];
                ret[1] = keyT[r2][c1];
            }
        } else {
            if (c1 == c2) {
                r1 = (r1 - 1) % 5;
                r2 = (r2 - 1) % 5;
                if (r1 < 0) r1 = 4;
                if (r2 < 0) r2 = 4;

                ret[0] = keyT[r1][c1];
                ret[1] = keyT[r2][c2];
            } else if (r1 == r2) {
                c1 = (c1 - 1) % 5;
                c2 = (c2 - 1) % 5;
                if (c1 < 0) c1 = 4;
                if (c2 < 0) c2 = 4;

                ret[0] = keyT[r1][c1];
                ret[1] = keyT[r2][c2];
            } else {
                ret[0] = keyT[r1][c2];
                ret[1] = keyT[r2][c1];
            }
        }
        return ret;
    }

    public static String encrypt (String msg, char[][] keyT) {
        String cipherText = "";
        for (int i = 0; i < msg.length()-1; i+=2) {
            char c1 = msg.charAt(i);
            char c2 = msg.charAt(i+1);
            char[] v = search(c1, c2, keyT, true);
            cipherText += v[0];
            cipherText += v[1];
        }
        return cipherText;
    }

    public static String decrypt (String msg, char[][] keyT) {
        String plainText = "";
        for (int i = 0; i < msg.length()-1; i+=2) {
            char c1 = msg.charAt(i);
            char c2 = msg.charAt(i+1);
            char[] v = search(c1, c2, keyT, false);
            plainText += v[0];
            plainText += v[1];
        }
        return plainText;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String plain = in.next().toLowerCase();
        char[] key = in.next().toLowerCase().toCharArray();
        char[][] keyT = new char[5][5];

        //generating 5x5 key table
        generateKeyTable(key, keyT);
        
        //preparing the plain text according to the rule of playfair
        plain = prepareText(plain);

        System.out.println ("------------------------------------");
        System.out.println ("Input plain text : " + plain);
        String enc = encrypt(plain, keyT);
        System.out.println ("Encrypted Cipher text : " + enc);
        System.out.println ("Decrypted Plain text : " + decrypt(enc, keyT));
        in.close();

    }
}
/**
instruments
monarchy
 */