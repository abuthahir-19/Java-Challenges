import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class NthLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List <Integer> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ar.add(in.nextInt());
        }
        int k = 3;
        while (k != 0) {
            int max = Collections.max(ar);
            ar.remove(ar.indexOf(max));
            k -= 1;
        }
        System.out.println (Collections.max(ar));
        in.close();
    }
}

/**
7
25 26 7 8 10 11 79
*/