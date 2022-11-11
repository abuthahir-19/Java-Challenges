import java.util.Scanner;

public class Reshape {
    public static int[][] getReshapedMatrix (int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] res = new int[r][c];
        int idx1 = 0, idx2 = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (idx2 == c) {
                    idx2 = 0;
                    idx1+=1;
                }
                res[idx1][idx2] = mat[i][j];
                idx2+=1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        int r = in.nextInt();
        int c = in.nextInt();
        int[][] reshaped = getReshapedMatrix (mat, r, c);
        System.out.println ("Resultant Matrix : ");
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print (reshaped[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
