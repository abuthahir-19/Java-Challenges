import java.util.*;

public class BallonCost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        int p = in.nextInt();
        int n = in.nextInt(); 
        boolean isFirsted = true;

        int gSum = 0, pSum = 0;
        for (int i = 1; i <= n; i++) {
            int prob1 = in.nextInt();
            int prob2 = in.nextInt();

            if (isFirsted) {
                if (prob1 == 1) gSum += g;
                if (prob2 == 1) pSum += p;
            }
            else {
                if (prob1 == 1) pSum += p;
                if (prob2 == 1) gSum += g;
            }
            isFirsted = !isFirsted;
        }
        System.out.println (gSum + " " + pSum);
        in.close();
    }
}