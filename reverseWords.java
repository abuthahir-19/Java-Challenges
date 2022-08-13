import java.util.Scanner;

public class reverseWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0) {
            String s = in.next();
            Solution obj = new Solution();
            System.out.println (obj.reverseWords(s));
            t-=1;
        }
        in.close();
    }
}

class Solution {
    public String reverseWords (String s) {
        String res = "";
        String[] arr = s.split("\\.");
        // System.out.println (arr.length);
        return res;
    }
}