import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SubArrayProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        Solution obj = new Solution();
        long res = obj.maxProduct(ar, n);
        System.out.println(res);
        in.close();
    }
}

class Solution {
    long maxProduct (int[] ar, int size) {
        List <Long> products = new ArrayList<>();
        long prod = 1;
        for (int i = 0; i < size; i++) {
            if (ar[i] == 0) {
                long val = ar[i];
                products.add(val);
                prod = 1;
            }
            else {
                prod *= ar[i];
                products.add (prod);
            }
        }
        System.out.println(products);
        return Collections.max(products);
    }
}
/**
5
6 -10 -3 0 2

6
2 3 4 5 -1 0

10
8 -2 -2 0 8 0 -6 -8 -6 -1

5
0 0 -5 0 0
**/