import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LuckyDraw {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List <Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            list.add(val);
        }
        for (int i = 0; i < n-1; i++) {
            int pos = in.nextInt();
            list.remove(pos-1);
        }
        for (int ele : list) {
            System.out.println (ele);
        }
        in.close();
    }
}
/**
6
100 200 300 400 500 600
1 4 2 3 1
400



11
7 18 10 5 25 17 16 12 34 99 26
2 5 8 6 4 2 3 4 2 2
7
**/