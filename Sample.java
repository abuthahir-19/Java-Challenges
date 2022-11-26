import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.Set;

public class Sample {
    // @Deprecated
    // public static void main(String[] args) throws ParseException {
    //     Scanner in = new Scanner (System.in);
    //     String[] s= in.nextLine().split(" ");
    //     String date = "";
    //     for (int i = 0; i < s.length; i+=1) {
    //         if (i < s.length-1)
    //         date += s[i] + "-";
    //         else date += s[i];
    //     }
    //     SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
    //     Date d = formatter.parse(date);
    //     switch (d.getDay()) {
    //         case 0 : System.out.println ("Sunday".toUpperCase()); break;
    //         case 1 : System.out.println ("Monday".toUpperCase()); break;
    //         case 2 : System.out.println ("Tuesday".toUpperCase()); break;
    //         case 3 : System.out.println ("Wednesday".toUpperCase()); break;
    //         case 4 : System.out.println ("Thursday".toUpperCase()); break;
    //         case 5 : System.out.println ("Friday".toUpperCase()); break;
    //         case 6 : System.out.println ("Saturday".toUpperCase()); break;
    //     }
    //     in.close();
    // }
    public static void main(String[] args) {
        // int x = new Scanner (System.in).nextInt();
        Set <char[]> st = new HashSet<>();
        st.add ("Geeks".toCharArray());
        for (char[] value : st) {
            for (int i = 0; i < value.length; i++) {
                System.out.print (value[i] + "");
            }
            System.out.println();
        }
    }
}
