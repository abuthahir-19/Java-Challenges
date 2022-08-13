import java.util.ArrayList;
import java.util.Scanner;

public class SubArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        ArrayList<Integer> pos = new Solution().subarray(ar, n, s);
        System.out.println (pos);
        in.close();;
    }
}

class Solution {
    public ArrayList <Integer> subarray (int[] ar, int size, int s) {
        ArrayList<Integer> obj = new ArrayList<>();
        int start = -1, end = -1;

        for (int i = 0; i < size; i++) {
            int sum = 0;
            start = i;
            for (int j = i; j < size; j++) {
                sum += ar[j];
                if (sum == s) {
                    end = j;
                    break;
                }
            }
            if (sum == s) break;
        } 
        if (start != -1 && end != -1) {
            obj.add(start + 1);
            obj.add(end + 1);
        }
        else obj.add (-1);
        return obj;
    }
}

/*
5 12
1 2 3 7 5

10 15
1 2 3 4 5 6 7 8 9 10
**/