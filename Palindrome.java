import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Palindrome {
    // public static boolean isPalindrome (String s) {
    //     int start = 0, end = s.length()-1;
    //     while (start < end) {
    //         if (s.charAt(start) != s.charAt(end)) return false;
    //         start += 1;
    //         end -= 1;
    //     }
    //     return true;
    // }

    public static void printFrequency (int[] arr, int n) {
        Map <Integer, Integer> f = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int v = arr[i];
            if (f.containsKey(v)) {
                f.put(v, f.get(v) + 1);
            } else f.put (v, 1);
        }

        for (Map.Entry <Integer, Integer> o : f.entrySet()) {
            System.out.println (o.getKey() + " " + o.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String s = in.next();
        // if (isPalindrome (s)) {
        //     System.out.println ("1");
        // } else System.out.println ("0");

        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i+=1) 
            ar[i] = in.nextInt();

        printFrequency (ar, n);
        in.close();
    }
}
/**
8
10 20 20 10 10 20 5 20
**/