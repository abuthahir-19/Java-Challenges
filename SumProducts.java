import java.util.ArrayList;
import java.util.Scanner;

public class SumProducts {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        String str = in.next();
        ArrayList <Integer> list = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < str.length(); i+=2) {
            String s = "";
            for (int j = i; j < (i+2) && j < str.length(); j++) {
                s += (str.charAt(j));
            }
            list.add(Integer.parseInt(s));
        }
        for (int i = 0; i < list.size()-1; i+=2) {
            sum += (list.get(i) * list.get(i+1));
        }
        if (list.size() % 2 != 0) {
            sum += (list.get(list.size()-1));
        }
        System.out.println (sum);
        in.close();
    }
}
/**
1234567

120014
**/