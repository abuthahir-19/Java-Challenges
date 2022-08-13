import java.util.Scanner;

public class Parellelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int h = in.nextInt();
        if (b < 1 || h < 1) {
            System.out.println ("java.lang.Exception: Breadth and height must be positive");
        }
        else {
            System.out.println (b * h);
        }
        in.close();
    }
}
