import java.util.Scanner;

public class ZigZagConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String st = in.next();
        int rows = in.nextInt();
        System.out.println (getConvertedString(st, rows));
        in.close();
    }

    public static String getConvertedString (String s, int numRows) {
        char[][] sChars = new char[numRows][s.length()];
        boolean forward = true;
        int idx = 0, row = 0, col = 0;
        String res = "";
        int lastState = 0;
        while (idx < s.length()) {
            if (forward) {
                if (row < 0) row = 0;

                if (lastState == row && idx > 0) row +=1;
                
                if (row >= numRows) row = row % numRows;

                sChars[row][col] = s.charAt(idx);
                lastState = row;
                row += 1;
                if (row == numRows) {
                    forward = !forward;
                    row -= 2;
                    col += 1;
                }
            } else {
                if (row < 0) row = 0;

                if (lastState == row) row += 1;
                
                if (row >= numRows) row = row % numRows;
                sChars[row][col] = s.charAt(idx);
                lastState = row;
                col += 1;
                row -= 1;
                if (row <= 0) {
                    forward = !forward;
                }
            }
            idx += 1;
        }

        for (int i = 0; i < sChars.length; i++) {
            for (int j = 0; j < sChars[i].length; j++) {
                char val = sChars[i][j];
                if (val != '\u0000') {
                    System.out.print (val + " ");
                    res += val;
                }
                else System.out.print (" " + " ");
            }
            System.out.println();
        }
        return res;
    }
}

/**
PAYPALISHIRING
3
 */