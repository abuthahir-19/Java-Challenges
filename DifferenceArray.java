import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DifferenceArray {
    static List <int[]> result = new ArrayList<>();

    public static void initializeArray (int[] a, int[] d) {
        int len = a.length;
        d[0] = 0;
        d[len] = 0;
        for (int i = 1; i < len; i++) {
            d[i] = a[i] - a[i-1];
        }
    }


    public static void update (int[] d, int l, int r, int x) {
        d[l] += x;
        d[r+1] -= x;
    }

    public static void printArray (int[] a, int[] d) {
        for (int i = 0; i < a.length; i++) {
            if (i == 0) 
                a[i] = d[i];
            
            else 
                a[i] = d[i] + a[i-1];
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int[] d = new int[n+1];
        initializeArray (arr, d);
        int query = in.nextInt();
        while (query > 0) {
            int l = in.nextInt();
            int r = in.nextInt();
            int x = in.nextInt();
            update (d, l, r, x);
            printArray(arr, d);
            result.add(arr);
            query -= 1;
        }

        for (int i = 0; i < result.size(); i++) {
            int[] a = result.get(i);
            for (int j = 0; j < a.length; j++) {
                System.out.print (a[j] + " ");
            }
            System.out.println();
        }
        
        in.close();
    }
}

/**
4
10 5 20 40
3
0 1 10
1 3 20
2 2 30
**/