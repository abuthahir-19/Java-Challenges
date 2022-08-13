import java.util.Scanner;

public class XWithAsterisk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int start = 1;
        int end = (n*2)-1;
        while (start != end) {
            for (int i = 1; i < (n*2); i++) {
                if (i == start || i == end) {
                    System.out.print (start + "");
                }
                else System.out.print ("*");
            }
            System.out.println ();
            start++;
            end--;
        }
        for (int i = 1; i < (n*2); i++) {
            if (i == start)
            System.out.print (start+"");
            else System.out.print ("*");
        }
        start--; end++;
        System.out.println();
        while (start >= 1 && end < (n*2)) {
            for (int i = 1; i < (n*2); i++) {
                if (i == start || i == end) {
                    System.out.print (start + "");
                } else System.out.print ("*");
            }
            System.out.println();
            start--;
            end++;
        }
        in.close();
    }
}
