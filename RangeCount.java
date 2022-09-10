import java.util.Scanner;

public class RangeCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int start = in.nextInt();
        int end = in.nextInt();

        int count = 0;
        for (int value : a) {
            if (value >= start && value <= end) count += 1;
        }
        System.out.println(count);
        in.close();
    }
}
