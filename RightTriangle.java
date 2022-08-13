import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a == Math.sqrt(Math.pow(b, 2) + Math.pow (c, 2))) {
            System.out.println ("Yes");
        }
        else if (b == Math.sqrt(Math.pow (a, 2) + Math.pow (c, 2))) {
            System.out.println ("Yes");
        }
        else if (c == Math.sqrt(Math.pow (a, 2) + Math.pow (b, 2))) {
            System.out.println ("Yes");
        }
        else System.out.println ("No");
        in.close();
    }
}
