import java.util.*;

public class InterchangeDia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) 
                mat[i][j] = in.nextInt();
        }
        int r = 0, c = n-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    int t = mat[r][c];
                    mat[r][c] = mat[i][j];
                    mat[i][j] = t;
                    c-=1;
                }
            }
            r+=1;
        }

        System.out.println("Output : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print (mat[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
/**
3
5 1 6
4 2 9
8 7 3

4
54 86 35 71
78 32 85 62
69 84 66 45
37 79 73 30
**/