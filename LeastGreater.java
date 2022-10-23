import java.util.*;

public class LeastGreater {
    public static ArrayList <Integer> findLeastGreater (int[] arr, int n) {
        List <Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int ele = -1;
            int min = Integer.MAX_VALUE;

            for (int j = i+1; j < n; j++) {
                if (arr[j] > arr[i] && arr[j] < min) {
                    min = arr[j];
                    ele = min;
                }
            }
            res.add(ele);
        }
        return (ArrayList<Integer>) res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        List <Integer> result = findLeastGreater(arr, n);
        for (int i = 0; i < result.size(); i++) {
            System.out.print (result.get(i) + " ");
        }
        in.close();
    }
}

/*
15
8 58 71 18 31 32 63 92 43 3 91 93 25 80 28
**/