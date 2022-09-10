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

        for (int i = 0; i < n-1; i++) {
            values.add(Math.abs ((a[i] - i) - (a[i+1] - (i+1))));
        }
        System.out.println(Collections.max(values));
        in.close();
    }
}

/**
5
9 15 4 12 13

5
-1 -2 -3 4 10
**/