import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String words = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch == ',' && str.charAt(i+1) != ' ') || (ch == ' ' && str.charAt(i+1) != ',')) {
                words += " ";
            }
            else if (ch == ' ' || ch == ',') words += " ";
            else if (Character.isAlphabetic(ch)) words += ch;
        }
        // String[] word = words.split(" ");
        System.out.println (words);
    }
}
