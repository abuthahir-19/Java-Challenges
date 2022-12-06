import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class FirstNTerms {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int prev = 1;
        List <Integer> series = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int start = prev;
            for (int ctr = 1; ctr <= i; ctr++) {
                sum += start;
                start += 1;
            }
            prev = start;
            series.add (sum);
        }
        for (int value : series) {
            System.out.print (value + " ");
        }
        in.close();
    }
}
