import java.util.Scanner;

public class StrongPassword {
    public static int minimum (int n, String password) {
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String password = in.next();
        System.out.println(minimum(len, password));
        in.close();
    }
}
