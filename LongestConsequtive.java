import java.util.Scanner;

public class LongestConsequtive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = Integer.toBinaryString(n);
        System.out.println(s);
        int c = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '1') c++; 
            else {
                if (c > max) max = c;
                c = 0;
            }
        }
        if (c > max) max = c;
        System.out.println (max);
        in.close();
    }
}