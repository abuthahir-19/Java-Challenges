import java.util.Scanner;

public class SubMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int[][] mat = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        
        int s = in.nextInt();

        int rowEnd = 2;
        int colEnd = 2;
        //submat 
        for (int i = 0; i < r; i++) {
            if (Math.abs(r-i) >= 2) {
                colEnd = 2;
                for (int j = 0; j < c; j++) {
                    if (Math.abs(c - j) >= 2) {
                        int sum = 0;
                        for (int v = i; v < rowEnd; v++) {
                            for (int k = j; k < colEnd; k++) {
                                sum += mat[v][k];   
                            }
                        }
                        if (sum == s) {
                            printSubMat(i, rowEnd, j, colEnd, mat);
                            System.exit(1);
                        }
                        colEnd++;
                    }
                }
                rowEnd++;
            }else break;
        }
        in.close();
    }

    private static void printSubMat (int startR, int endR, int startC, int endC, int[][] mat) {
        System.out.println ("Output :");
        for (int i = startR; i < endR; i++) {
            for (int j = startC; j < endC; j++) {
                System.out.print (mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/**
3 3
23 12 45
25 26 29
33 35 36
119


4 3
48 10 77
4 99 15
75 29 97
40 84 62
272
**/