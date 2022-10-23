import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaxInChefLand {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader (System.in));
        int t = Integer.parseInt(bf.readLine());
        while (t > 0) {
            int income = Integer.parseInt(bf.readLine());
            if (income > 100) {
                income -= 10;
            }
            System.out.println(income);
            t -= 1;
        }
    }
}
