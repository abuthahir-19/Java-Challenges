import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;;

public class EvenGetBigger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            if (val % 2 == 0) 
                list.add(val);
        }
        if (list.size() > 0)
            for (int val : list) {
                System.out.print (val + "");
            }
        else System.out.println(0);
        in.close();
    }
}
