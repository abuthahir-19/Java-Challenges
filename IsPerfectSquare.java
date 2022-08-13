import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class IsPerfectSquare {
    private static int getWeight (int value) {
        if (checkPerfectSquare (value)) return 5;
        if (value % 4 == 0 && value % 6 == 0) return 4;
        if (value % 2 == 0) return 3;
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nums = in.nextLine().split(" ");
        ArrayList<Integer> lst = new ArrayList<>();
        Map <Integer, Integer> valWeight = new HashMap<>();

        for (String val : nums) {
            lst.add (Integer.parseInt(val));
        }

        for (int i = 0; i < lst.size(); i++) {
            int value = lst.get(i);
            valWeight.put (value, getWeight(value));
        }

        for (Map.Entry <Integer, Integer> obj : valWeight.entrySet()) {
            System.out.println (obj.getKey() + " " + obj.getValue());
        }
    }

    private static boolean checkPerfectSquare (int n) {
        int val = (int) Math.floor (Math.sqrt(n));
        if ((val * val) == n) return true;
        return false;
    }
}