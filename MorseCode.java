import java.util.Scanner;

public class MorseCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String alp = "abcdefghijklmnopqrstuvwxyz";
        String res = "";
        while (in.hasNextLine()) {
            String[] str = in.nextLine().split(" ");
            res += (alp.charAt(str.length-1));
        }
        System.out.println (res);
        in.close();
    }
}