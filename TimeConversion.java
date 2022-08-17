import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.next().split(":");
        int hh = Integer.parseInt (str[0]);
        int mm = Integer.parseInt (str[1]);
        int ss = Integer.parseInt (str[2].substring(0, 2));
        String format = str[2].substring(2);
        
        if (format.equals("AM")) {
            hh = hh % 12;
        }else if (format.equals ("PM")) {
            hh = (hh + 12) % 24;
        }
        
        String hS = String.format("%" + 2 + "s", hh).replace(' ', '0');
        String mS = String.format("%" + 2 + "s", mm).replace(' ', '0');
        String sS = String.format("%" + 2 + "s", ss).replace(' ', '0');

        String converted = hS + ":" + mS + ":" + sS;
        System.out.println(converted);
        in.close();
    }
}
/**
12:01:00AM


12:45:54PM

07:05:45PM
**/