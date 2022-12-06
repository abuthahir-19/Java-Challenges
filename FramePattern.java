import java.util.Scanner;

public class FramePattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) 
                mat[i][j] = in.nextInt();
        }
        for (int i = 0; i <= (n+1); i++) {
            System.out.print ("* ");
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            System.out.print ("* ");
            for (int j = 0; j < n; j++) {
                System.out.print (mat[i][j] + " ");
            }
            System.out.println ("*");
        }
        for (int i = 0; i <= (n+1); i++) {
            System.out.print ("* ");
        }
        in.close();
    }
}

/**
3 4
8 6 5 8
4 8 5 2
3 7 6 8
*/