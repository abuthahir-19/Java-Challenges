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
        int[] a = new int[10000001];
        for (int i = 0; i < n; i++) {
            int e = in.nextInt();
            list.add(e);
            a[e] += 1;
        }
        int q = in.nextInt();
        while (q > 0) {
            int s = in.nextInt();
            int e = in.nextInt();
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                int v = list.get(i);
                int count = a[v];
                if (count >= s && count <= e) {
                    sum += v;
                }
            }
            res.add(sum);
            q -= 1;
        }
        for (int val : res) {
            System.out.println (val);
        }
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
