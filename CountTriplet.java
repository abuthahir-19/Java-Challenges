import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.List;

public class CountTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        HashSet <List <Integer>> triplets = new HashSet<>();

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int k = in.nextInt();
        for (int i = 0; i < n; i +=1) {
            int s = a[i];
            List <Integer> ele = new ArrayList<>();
            ele.add(s);
            for (int j = i+1; j < n-1; j++) {
                s += (a[j] + a[j+1]);
                if (s == k) {
                    ele.add(a[j]);
                    ele.add(a[j+1]);
                    triplets.add(ele);
                }
            }
        }
        System.out.println(triplets.size());
        in.close();
    }
}
/**
6
9 -2 1 4 2 2
8

4
1 1 1 1
3
**/