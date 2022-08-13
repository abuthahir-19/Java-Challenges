import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Enter the size of the list :");
        int n = in.nextInt();
        System.out.println ("Enter the elements of the list :");
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        System.out.println ("Minimum value in the list is : " + Collections.max(list));
        
        in.close();
    }
}
