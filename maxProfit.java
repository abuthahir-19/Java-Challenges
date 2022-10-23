import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class maxProfit {
    public static int getMaxProfit (int[] arr, int n) {
        int least_so_far = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < least_so_far) {
                least_so_far = arr[i];
            }
            pist = arr[i] - least_so_far;
            if (op < pist) {
                op = pist;
            }
        }
        return op;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] line = bf.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < line.length; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }
        int res = getMaxProfit(arr, n);
        System.out.println (res);
        bf.close();
    }
}
/**
6
7 1 5 3 6 4

lst = maxValue
op = 0
pist = 0

Iteration 1:

lsf = 7
pist = 7 - 7 = 0
op < pist => 0 < 0 => false


Iteration 2:

lst = 7
1 < lst => 1 < 7 => true
lst = 1
pist = 1 - 1 = 0;

Iteration 3:

lst = 1
5 < 1 => false
pist = 5 - 1 = 4
0 < 4 => true
op = 4

Iteration 4:





5
7 6 4 3 1
**/