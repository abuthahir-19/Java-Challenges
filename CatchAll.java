import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatchAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List <Integer> one = new ArrayList<>();
        List <Integer> two = new ArrayList<>();
        List <Integer> three = new ArrayList<>();
        int a = in.nextInt();
        for (int i = 0; i < a; i++) {
            one.add(in.nextInt());
        }
        int b = in.nextInt();
        for (int i = 0; i < b; i++) {
            two.add(in.nextInt());
        }
        int c = in.nextInt();
        for (int i = 0; i < c; i++) {
            three.add (in.nextInt());
        }

        int sum = 0;
        //counting common element
        for (int i = 0; i < c; i++) {
            int val = three.get(i);
            if (one.contains(val) && two.contains(val)) {
                sum += val;
            }
        }
        System.out.println(sum);
        in.close();
    }
}
