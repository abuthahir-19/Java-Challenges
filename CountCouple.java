import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class CountCouple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        HashSet <List <Integer>> couples = new HashSet<>();

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int k = in.nextInt();
        for (int i = 0; i < n; i++) {
            List <Integer> ele = new ArrayList<>();
            for (int j = i+1; j < n; j++) {
                if (a[i] + a[j] == k) {
                    ele.add(a[i]);
                    ele.add(a[j]);
                    Collections.sort(ele);
                    couples.add(ele);
                }
            }
        }
        System.out.println(couples.size());
        in.close();
    }
}

/**
4
1 5 7 -1
6

5
1 5 7 -1 5
6
**/