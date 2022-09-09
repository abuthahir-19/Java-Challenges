import java.util.Scanner;

public class PeterCalender {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int month = in.nextInt();
        int d = in.nextInt();
        int col = 1;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            for (int i = 1; i <= 31; i++) {
                if (d > 7) {
                    d = 1;
                    col += 1;
                }
                d += 1;
            }
        } else {
            for (int i = 1; i <= 30; i+=1) {
                if (d > 7) {
                    d = 1;
                    col += 1;
                }
                d+=1;
            }
        }
        System.out.println(col);
        in.close();
    }
}
