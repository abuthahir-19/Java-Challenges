import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Multiples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        List <Integer> list = new ArrayList<>();
        int i, j;
        for (i = 1; i <= n; i++) {
            if (i % x == 0) {
                list.add (i);
            }
        }
        i = 0; j = list.size()-1;
        while (i < j) {
            System.out.print (list.get (i) + " " + list.get (j) + " ");
            i += 1;
            j -= 1;
        }
        if (i == j) {
            System.out.print (list.get (i));
        }
        in.close();
    }
}
