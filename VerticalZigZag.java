import java.util.*;
public class VerticalZigZag {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = in.nextInt();
            }
        }

        //Logic to print vertically
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print (mat[j][i] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
/**
5 
1 10 11 20 21
2 9 12 19 22 
3 8 13 18 23 
4 7 14 17 24 
5 6 15 16 25
**/