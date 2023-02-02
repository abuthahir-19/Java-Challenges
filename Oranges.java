import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Oranges {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt (bf.readLine());
        while (test > 0) {
            String[] line = bf.readLine().split(" ");
            int n = Integer.parseInt (line[0]);
            int m = Integer.parseInt (line[1]);
            int min = Math.min(n, m);
            if (min == 1) System.out.println (1);
            else if (min == 2) {
                System.out.println (min);
            } else {
                System.out.println (Math.abs (min - Math.max (n, m)));
            }
            test -= 1;
        }
    }
}
