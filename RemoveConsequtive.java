import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveConsequtive {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String s = in.next();
        String res = "";
        List <Integer> removeIndex = new ArrayList<>();
        for (int i = 0; i < s.length()-1; i++) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt (i+1);
            if (Character.isUpperCase(ch1) && Character.isUpperCase(ch2)) {
                removeIndex.add (i+1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (!removeIndex.contains(i)) {
                res += s.charAt(i);
            }
        }

        System.out.println (res);
        
        in.close();
    }
}

/**
rDFjksdfGJejJKDbfgKrSDF
 */