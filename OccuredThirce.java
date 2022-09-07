import java.util.Scanner;

public class OccuredThirce {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int value = in.nextInt();
            if (i % 2 == 0) sum += value;
        }
        System.out.println(sum);
        in.close();
    }
}
