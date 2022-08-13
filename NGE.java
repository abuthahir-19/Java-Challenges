import java.util.Scanner;

public class NGE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            boolean caught = false;
            for (int j = i+1; j < n; j++) {
                if (ar[j] > ar[i]) {
                    caught = true;
                    System.out.printf ("%d ", ar[j]);
                    break;
                }
            }
            if (!caught) {
                System.out.printf ("%d ", -1);
            }
        }
        in.close();
    }
}