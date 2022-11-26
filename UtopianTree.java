import java.util.Scanner;

public class UtopianTree {
    public static int getHeight (int n) {
        int height = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                height += 1;
            } else {
                height *= 2;
            }
        }
        return height;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        System.out.println(getHeight(n));
        in.close();
    }
}