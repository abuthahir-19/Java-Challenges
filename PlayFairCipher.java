import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class PlayFairCipher {
    static char[][] keyTable;
    public static void createGrid (String key) {
        keyTable = new char[5][5];
        StringBuilder alpha = new StringBuilder("ABCDEFGHIKLMNOPQRSTUVWXYZ");
        List <Character> inserted = new ArrayList<>();
        int idx = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (idx < key.length()) {
                    char c = key.charAt(idx);
                    if (!inserted.contains(c)) {
                        inserted.add(c);
                        keyTable[i][j] = c;
                        alpha.deleteCharAt(alpha.indexOf(c+""));
                    } 
                }
                else {
                    keyTable[i][j] = alpha.charAt(0);
                    alpha.deleteCharAt(0);
                }
                idx += 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String key = in.next().toUpperCase();
        createGrid(key);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print (keyTable[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}