import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaximumValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        List <Integer> values = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (i != j) {
                    int f = a[i] - i;
                    int s = a[j] - j;
                    values.add(f - s);
                }
            }
        }
        System.out.println(Collections.max(values));
        in.close();
    }
}
