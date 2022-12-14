import java.util.Scanner;

public class MiddleReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String s = in.next();
        int k = in.nextInt();
        String res = "";
        int mid = s.length()/2;
        int start, end;
        if (k % 2 == 0) {
            start = mid - (k /2);
            end = mid + ((k/2)-1);
        } else {
            start = mid - (k / 2);
            end = mid + (k / 2);
        }
        
        for (int i = 0; i < start; i++) {
            res += s.charAt (i);
        }

        for (int i = end; i >= start; i--) {
            res += s.charAt(i);
        }

        for (int i = end + 1; i < s.length(); i++) {
            res += s.charAt(i);
        }

        System.out.println (res);
        in.close();
    }
}
