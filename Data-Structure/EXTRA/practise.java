import java.util.Stack;
import java.util.Scanner;

public class practise {
    public static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (char c : infix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            } 
            else if(c == '('){
                stack.push(c);
            } 
            else if(c == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    postfix.append(stack.pop());
                }
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop(); 
                }
            } 
            else if (isOperator(c)) {
                while(!stack.isEmpty() && isOperator(stack.peek()) && getPrecedence(c) <= getPrecedence(stack.peek())){
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    private static int getPrecedence(char c) {
        switch (c) {
            case '^':
            return 3;
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String infix = sc.nextLine();
        String postfix = infixToPostfix(infix);
        System.out.println("Postfix: " + postfix);
        sc.close();
    }
}