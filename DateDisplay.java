import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class Result {
    @Deprecated
    public static String findDay (int month, int day, int year) {
        String date_string = month + "-" + day + "-" + year;
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        String res = "";
        try {
            Date d = formatter.parse(date_string);
            switch (d.getDay()) {
                case 0 : res = "Sunday"; break;
                case 1 : res = "Monday"; break;
                case 2 : res = "Tuesday"; break;
                case 3 : res = "Wednesday"; break;
                case 4 : res = "Thursday"; break;
                case 5 : res = "Friday"; break;
                case 6 : res = "Saturday"; break;
            }

        } catch (ParseException e) {
            System.out.println (e);
        }
        return res.toUpperCase();
    } 
}

public class DateDisplay {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split(" ");
        int month = Integer.parseInt(str[0]);
        int day = Integer.parseInt(str[1]);
        int year = Integer.parseInt(str[2]);

        String res = Result.findDay(month, day, year);
        System.out.println (res);
        in.close();
    }    
}
