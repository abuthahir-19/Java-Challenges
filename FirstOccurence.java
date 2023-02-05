import java.util.Scanner;

public class FirstOccurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String haystack = in.next();
        String needle = in.next();
        System.out.println (getFirstOccurence (haystack, needle));
        in.close();
    }

    public static int getFirstOccurence (String haystack, String needle) {
        return haystack.indexOf(needle, 0);
    }
}
