import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        System.out.println (new Solution ().leader(ar, n));
        in.close();
    }
}

class Solution {
    public ArrayList<Integer> leader (int[] ar, int size) {
        ArrayList <Integer> lead = new ArrayList<>();
        int max = ar[size-1];
        for (int i = size-2; i >= 0; i--) {
            if (ar[i] > max) {
                lead.add(max);
                max = ar[i];
            }
        }
        lead.add(max);
        Collections.reverse(lead);
        return lead;
    }
}

/**
6
16 17 4 3 5 2 

5
1 2 3 4 0
**/