
import java.util.Scanner;
import java.util.Stack;

public class PostfixToInfix {
    public String ConvertToInfix (String postfix) {
        Stack <String> stack = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch+"");
            }
            else {
                String op1 = stack.peek();
                stack.pop();
                String op2 = stack.peek();
                stack.pop();
                stack.push ("(" + op2 + ch + op1 + ")");
            }
        }
        return stack.peek();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String post = sc.nextLine();
        PostfixToInfix pti = new PostfixToInfix();
        System.out.println (pti.ConvertToInfix(post));
        sc.close();
    }
}
/**
ab*c+
((a*b)+c)
**/