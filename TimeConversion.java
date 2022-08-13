import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.next().split(":");
        int hh = Integer.parseInt (str[0]);
        int mm = Integer.parseInt (str[1]);
        int ss = Integer.parseInt (str[2].substring(0, str[2].length()-2));
        String form = str[2].substring(str[2].length()-2);
        int l = 2;

        if (form.equals("AM")) {
            
        }
        else {

        }
        in.close();
    }
}
/**
12:01:00AM


07:05:45PM
**/