import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class InsertSort {
    public static void getInsertionSort (int n, List <Integer> arr) {
        for (int i = n-1; i >= 0; i--) {
            int j = i;
            int end = arr.get (j);
            while (arr.get (j-1) > end) {
                arr.set (j, arr.get (j-1));
                j -= 1;
            }
            arr.set (j, arr.get (j-1));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        List <Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add (in.nextInt());
        }
        getInsertionSort(n, arr);
        System.out.println (arr);
        in.close();
    }
}
