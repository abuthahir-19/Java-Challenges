import java.util.Scanner;

public class PatternChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] str = new String[n];
        // String matcher = "geeksforgeeks";
        for (int i = 0; i < n; i++) {
            str[i] = in.next();
        }
    }
}