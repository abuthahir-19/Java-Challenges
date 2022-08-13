import java.util.Scanner;

public class CaseSenCharCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n = in.nextInt(), count = 0;
        char m = in.next().charAt(0);
        char ch;
        if (m == 'u' || m == 'U') {
            ch = (char) (64 + n);
        }
        else {
            ch = (char) (96+n);
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count += 1;
            }
        }
        System.out.println (count == 0 ? -1 : count);
        in.close();
    }
}
