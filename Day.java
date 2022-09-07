import java.util.Calendar;
import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String[] date = in.nextLine().split(" ");
        // int dd = Integer.parseInt (date[0]);
        // int mm = Integer.parseInt (date[1]);
        // int yy = Integer.parseInt (date[2]);
        
        Calendar c = Calendar.getInstance();
        System.out.println (c.get(Calendar.DAY_OF_WEEK));
    }
}
