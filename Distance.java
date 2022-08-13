import java.util.*;

public class Distance {
    public static double CalculateDistance (int x, int y) {
        int v1 = (int) Math.pow((0 - x), 2);
        int v2 = (int) Math.pow((0 - y), 2);
        return Math.sqrt(v1 + v2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println (String.format("%.2f", CalculateDistance(x, y)));
        sc.close();
    }    
}