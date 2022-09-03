import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        int s = in.nextInt();
        int e = in.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if ((ar[i] >= s && ar[i] <= e) && ar[i] % 3 != 0 && ar[i] % 5 != 0) {
                count += 1;
            }
        }
        System.out.println(count);
        in.close();
    }
}