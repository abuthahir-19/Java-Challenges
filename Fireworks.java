import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fireworks {
    int sum (int n) {
        int s = 0;
        while (n != 0) {
            s += (n % 10);
            n /= 10;
        }
        return s;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Fireworks ob = new Fireworks();
        int tes = Integer.parseInt (bf.readLine());
        while (tes > 0) {
            int n = Integer.parseInt (bf.readLine());
            int c= 0;
            for (int i = 1; i <= n; i++) {
                if ((i * ob.sum(i)) == n) c+=1;
            }
            System.out.println (c);
            tes -= 1;
        }
    }
}
