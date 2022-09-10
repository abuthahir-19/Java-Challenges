import java.util.Scanner;

public class Rearrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int idx = a[i];
            temp[idx] = i;
        }
        for (int val : temp) {
            System.out.println (val);
        }
        in.close();
    }
}
