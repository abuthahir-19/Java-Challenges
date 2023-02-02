import java.util.Scanner;

public class InsertInterval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int[][] intervals = new int[r][2];
        int[][] newIntervals = new int[1][2];
        for (int i = 0; i < r; i++) {
            intervals[i][0] = in.nextInt();
            intervals[i][1] = in.nextInt();
        }
    }
}