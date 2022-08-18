import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SumAsPerFrequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List <Integer> list = new ArrayList<>();
        List <Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i += 1) {
            list.add(in.nextInt());
        }
        int max = Collections.max(list);
        int[] a = new int[max+1];
        for (int i = 0; i < n; i++) {
            int ind = list.get(i);
            a[ind] += 1;
        }
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            int sum = 0;
            for (int j = 0; j < max+1; j++) {
                if (a[j] >= start && a[j] <= end) sum += j;
            }
            res.add(sum);
        }
        for (int i = 0; i < max+1; i++) {
            System.out.println(i + " -> " + a[i]);
        }
        System.out.println(res);
        in.close();
    }
}

/**
8
4 4 6 5 3 3 3 9
4
1 4
2 7
3 7
5 6
**/
