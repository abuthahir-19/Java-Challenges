import java.util.Scanner;

public class StrongPassword {
    public static boolean includesSplChars (String password) {
        String al = "!@#$%^&*()-+";
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (al.contains (ch + "")) return true;
        }
        return false;
    }
    public static int minimum (int n, String password) {
        int count = 0, missing = 0;
        boolean u = false, l = false, dig = false, spl = includesSplChars(password);
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c >= 'a' && c <= 'z') l = true;
            if (c >= 'A' && c <= 'Z') u = true;
            if (c >= '0' && c <= '9') dig = true;
        }        

        if (u == false) missing +=1;
        if (l == false) missing +=1;
        if (dig == false) missing += 1;
        if (spl == false) missing += 1;

        if (password.length() < 6) {
            count = (6 - password.length());
            return (missing + n) >= 6 ? missing : (Math.abs(6 - (missing + n)) + (missing + n)) ;
        } else {
            return missing;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String pass = in.next();
        System.out.println (minimum(len, pass));
        in.close();
    }
}
