import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListChallenge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList <List <Integer>> lines = new ArrayList<>();
        List <String> output = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int size = in.nextInt();
            List <Integer> list = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                list.add(in.nextInt());
            }
            lines.add(list);
        }

        int q = in.nextInt();

        for (int i = 0; i < q; i++) {
            int x = in.nextInt()-1;
            int y = in.nextInt()-1;
            List <Integer> lst = lines.get(x);
            if (lst.size() > y) {
                output.add(Integer.toString(lst.get(y)));
            }
            else {
                output.add ("ERROR!");
            }
        }

        for (String lst : output) {
            System.out.println(lst);
        }

        in.close();
    }
}

/**
8
7 43 35 26 34 78 99 70
3 71 11 16
8 70 19 42 30 84 20 57 45
0
1 20
0
0
0
10
5 1
5 7
1 7
5 3
5 2
4 7
5 2
1 2
4 1
2 3 
**/