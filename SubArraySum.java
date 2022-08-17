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
        
        int curSum = ar[0];
        int start = 0;
        for (int i = 1; i < size; i++) {
            while (curSum > s && start < i-1) {
                curSum -= ar[start];
                start++;
            }
            if (curSum == s) {
                obj.add(start+1);
                obj.add(i);
                break;
            }

            curSum += ar[i];
        }
        if (obj.size() == 0) obj.add(-1);
        return obj;
    }
}

/*
5 12
1 2 3 7 5

10 15
1 2 3 4 5 6 7 8 9 10
**/