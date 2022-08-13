import java.util.Stack;
import java.util.Scanner;

public class PrefixToInfix {
    public String ConvertFromPrefix (String prefix) {
        Stack <String> stack = new Stack<>();
        for (int i = prefix.length()-1; i >= 0; i--) {
            char ch = prefix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch+"");
            }
            else {
                String op1 = stack.peek();
                stack.pop();
                String op2 = stack.peek();
                stack.pop();
                stack.push("(" + op1 + ch + op2 + ")");
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prefix = sc.nextLine();
        PrefixToInfix pti = new PrefixToInfix();
        System.out.println (pti.ConvertFromPrefix(prefix));
        sc.close();
    }
}