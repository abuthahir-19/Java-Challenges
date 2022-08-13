import java.util.ArrayList;
import java.util.Scanner;

public class CommonIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        ArrayList <Integer> mList = new ArrayList<>();
        ArrayList <Integer> nList = new ArrayList<>();
        ArrayList <Integer> common = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            mList.add(in.nextInt());
        }
        for (int i = 0; i < n; ++i) 
            nList.add(in.nextInt());
    
        for (int i = 0; i < m; i++) {
            int val = mList.get(i);
            if (!common.contains(val) && nList.contains(val)) {
                common.add(val);
            }
        }
        if (common.size() == 0) {
            System.out.println ("Invalid");
        }
        else System.out.println (common);
        in.close();
    }
}

/**
7 3
3 5 7 1 6 2 8
1 2 7


4 4 
3 4 1 0
0 1 1 9
**/
