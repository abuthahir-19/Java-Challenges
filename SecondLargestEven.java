import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class SecondLargestEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List <Integer> evens = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            if(val % 2 == 0) evens.add(val);
        }
        Collections.sort(evens);
        System.out.println (evens.get(1));
        in.close();
    }
}
