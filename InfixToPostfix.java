
import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    public static int precedence (char ch) {
        if (ch == '+' || ch == '-') return 1;
        else if (ch == '*' || ch == '/') return 2;
        else if (ch == '^') return 3;
        else return -1;
    }

    public String ConvertPostfix (String infix) {
        Stack<Character> stack = new Stack<>();
        String postfix = "";
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                postfix += ch;
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                while ((!stack.isEmpty()) && stack.peek() != '(') {
                    postfix += stack.pop();
                }
                stack.pop();
            }
            else {
                while ((!stack.isEmpty()) && precedence(ch) <= precedence(stack.peek())) {
                    postfix += stack.pop();
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') 
                return "Invalid Expression";
            postfix += stack.pop();
        }
        return postfix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String infix = sc.nextLine();
        InfixToPostfix itp = new InfixToPostfix();

        System.out.println (itp.ConvertPostfix (infix));
        sc.close();
    }
}

/**
a+b*(c^d-e)^(f+g*h)-i
**/