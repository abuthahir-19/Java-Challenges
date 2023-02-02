import java.util.Scanner;

public class FirstAndLastBits {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        String bin = Integer.toBinaryString(n);
        int firstN = Integer.parseInt(bin.substring(0, 3), 2);
        int lastN = Integer.parseInt (bin.substring(bin.length()-3, bin.length()), 2);

        System.out.println (firstN + " " + lastN);
        in.close();
    }
}