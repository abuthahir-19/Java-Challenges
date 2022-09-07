import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Leaders {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        List <Integer> output = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        int max = ar[n-1];
        output.add (max);
        for (int i = n-2; i >= 0; i--) {
            if (ar[i] > max) {
                max = ar[i];
                output.add (max);
            }
        }
        for (int i = output.size()-1; i >= 0; i--) {
            System.out.println(output.get(i));
        }
        in.close();
    }    
}
