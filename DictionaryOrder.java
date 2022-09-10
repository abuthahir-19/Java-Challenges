import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DictionaryOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List <String> names = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            names.add(in.next());
        }
        Collections.sort (names);
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        in.close();
    }
}
