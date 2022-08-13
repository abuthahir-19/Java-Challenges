import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Solution obj = new Solution();
        obj.rotateArr(a, d, n);
        for (int val : a) {
            System.out.print (val + " ");
        }
        in.close();
    }
}

class Solution {
    public void rotateArr (int a[], int d, int n) {
        int[] temp = new int[n];
        int index = 0;
        for (int i = d; i < n; i++) {
            temp[index] = a[i];
            index++;
        }

        for (int i = 0; i < d; i++) {
            temp[index] = a[i];
            index++;
        }
        for (int i = 0; i < index; i++) {
            a[i] = temp[i];
        }
    }
}
/**
5 2
1 2 3 4 5

10 3
2 4 6 8 10 12 14 16 18 20
**/