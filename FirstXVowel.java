import java.io.*;

public class FirstXVowel {
    public boolean isVowel (char c) {
        c = Character.toLowerCase(c);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        else return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        FirstXVowel ob = new FirstXVowel();
        String[] line = bf.readLine().split(" ");
        String str = line[0];
        String result = "";
        int x = Integer.parseInt (line[1]);
        for (char c : str.toCharArray()) {
            if (x > 0) {
                if (ob.isVowel(c)) {
                    result += c;
                    x -= 1;
                }
            }else break;
        }
        if (result.length() >= x) {
            System.out.println (result);
        } else System.out.println ("-1");
        bf.close();
    }
}

/**
ScorEboard 3

softcopy 5
 */