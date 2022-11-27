import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MaxSum {
    long getMaxSubarray (List <Long> a, long m) {
        Collections.sort (a, Collections.reverseOrder());
        Set <Long> values = new HashSet<>(a);
        
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MaxSum ob = new MaxSum();
        int q = in.nextInt();
        while (q > 0) {
            int n = in.nextInt();
            long m = in.nextLong();
            List <Long> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add (in.nextLong());
            }
            long ret = ob.getMaxSubarray(arr, m);
            System.out.println (ret);
            q -= 1;
        }
    }
}

/*
1
5 7
3 3 9 9 5
**/