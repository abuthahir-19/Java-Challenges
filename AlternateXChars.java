import java.util.Scanner;

public class AlternateXChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int x = sc.nextInt();
        int end;
        for (int i = 0; i < str.length(); i = i+(x*2)) {
            end = i + x;
            for (int j = i; j < end; j++) {
                System.out.printf("%c", str.charAt(j));
            }
        }
        sc.close();
    }
}