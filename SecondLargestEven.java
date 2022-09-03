import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class SecondLargestEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 4;
        List <Integer> evens = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            if (val % 2 == 0) evens.add(val);
        }
        int c = 1;
        while (c != 0) {
            int max = Collections.max(evens);
            evens.remove(evens.indexOf(max));
            c-=1;
        }
        System.out.println(Collections.max(evens));
        in.close();
    }
}
