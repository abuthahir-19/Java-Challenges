import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDig {
   public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int k = Integer.parseInt (bf.readLine());
        System.out.println (getLucky (s, k));
        bf.close();
   } 

   public static int getLucky (String s, int k) {
        int sum = 0;
        String converted = "";
        for (int i = 0; i < s.length(); i++) {
            converted += (s.charAt(i) - 'a' + 1);
        }

        while (k != 0) {
            int l = converted.length();
            for (int i = 0; i < l; i++) 
                sum += Character.getNumericValue (converted.charAt(i));
            
            converted = Integer.toString(sum);
            sum = 0;
            k-=1;
        }
        return Integer.parseInt (converted);
   }
}
