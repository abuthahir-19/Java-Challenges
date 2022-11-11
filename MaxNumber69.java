import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxNumber69 {
    public int getMaxNumber (int num) {
        char[] str = (num + "").toCharArray();
        int len = str.length;
        for (int i = 0; i < len; i++) {
            if (str[i] == '6') {
                str[i] = '9';
            }
        }
        return Integer.parseInt(new String(str));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt (bf.readLine());
        MaxNumber69 ob = new MaxNumber69();
        System.out.println (ob.getMaxNumber(num));
        bf.close();
    }
}
