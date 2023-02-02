import java.util.Scanner;

public class ReverseInGroups {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt(0);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        for (int i = 0; i < n; i+=k) {
            int dif = Math.abs (n - i);
            int end = dif >= k ? k : n-1;
            for (int j = end; j >= (end-k); j--) {
                System.out.print (arr[i] + " ");
            }
        }
        in.close();
    }
}