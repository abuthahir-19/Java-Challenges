import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OddGetsBigger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        List <Integer> odd = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
            if (ar[i] % 2 != 0) odd.add(ar[i]);
        }
        if (odd.size() == 0) System.out.println(0);
        else {
            Collections.sort (odd, Collections.reverseOrder());
            for (int val : odd) {
                System.out.print (val + "");
            }
        }
        in.close();
    }
}
