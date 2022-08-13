import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
    public static int majorityElement (int[] ar, int n) {
        HashMap <Integer, Integer> hm = new HashMap<>();
        if (n == 1) {
            return ar[0];
        }
        else {
            for (int i = 0; i < n; i++) {
                if (hm.containsKey(ar[i])) {
                    int count = hm.get(ar[i]) + 1;
                    if (count > ar.length / 2) {
                        return ar[i];
                    }
                    else {
                        hm.put (ar[i], count);
                    }
                }
                else hm.put (ar[i], 1);
            }
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++)  {
            ar[i] = in.nextInt();
        }
        System.out.println (majorityElement (ar, n));
        in.close();
    }
}