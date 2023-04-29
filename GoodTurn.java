import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GoodTurn {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt (bf.readLine());
        while (test-- > 0) {
            String[] line = bf.readLine().split(" ");
            int x = Integer.parseInt (line[0]);
            int y = Integer.parseInt (line[1]);
            if (x + y > 6) {
                System.out.println("YES");
            } else {
                System.out.println ("NO");
            }
        }
        bf.close();
    }
}
