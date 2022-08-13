import java.util.*;

public class EvenPos01{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] input = Integer.toBinaryString(in.nextInt()).toCharArray();
        int ind = 1;
        for (int i = input.length-1; i > 0; i--) {
            if (ind % 2 == 0 && input[i] == '0') {
                input[i] = '1';
            }
            ind+=1;
        }
        int value = Integer.parseInt(new String(input), 2);
        System.out.println (value);
        in.close();
    }
}
