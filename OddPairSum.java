import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddPairSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
		int t = Integer.parseInt(bf.readLine());
		while (t > 0) {
		    int xPm = Integer.parseInt(bf.readLine());
		    if ((xPm + 1) < 10) System.out.println ("Yes");
		    else System.out.println ("No");
		    t -= 1;
		}
		bf.close();
    }
}