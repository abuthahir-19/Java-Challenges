import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ListOps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        int q = in.nextInt();
        while (q != 0) {
            String query = in.next();
            if (query.equals("Insert")) {
                int index = in.nextInt();
                int element = in.nextInt();
                list.add(index, element);
            }
            else if (query.equals("Delete")) {
                int index = in.nextInt();
                list.remove(index);
            }
            q -= 1;
        }
        for (int value : list) {
            System.out.print (value + " ");
        }
        in.close();
    }
}
