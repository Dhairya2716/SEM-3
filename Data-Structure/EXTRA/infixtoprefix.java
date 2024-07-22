// code to convert infix to postfix

import java.util.Stack;
import java.util.Scanner;


public class infixtoprefix {

    public static void insert_at_bottom(char x){
        Stack<Character> st = new Stack<>();

		if (st.isEmpty()){
			
            st.push(x);

        }

		else {

			char a = st.peek();
			st.pop();
			insert_at_bottom(x);

			st.push(a);
		}
	}

	public static void reverse()
	{
        Stack<Character> st = new Stack<>();
		if (st.size() > 0) {

			char x = st.peek();
			st.pop();
			reverse();

			insert_at_bottom(x);
		}
	}


    public static String infixtoprefix1(String infix) {
        Stack<Character> st = new Stack<>();
    StringBuilder prefix = new StringBuilder();

        for (char c : infix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                prefix.append(c);
            } 
            else if(c == ')'){
                st.push(c);
            } 
            else if(c == '('){
                while(!st.isEmpty() && st.peek() != '('){
                    prefix.append(st.pop());
                }
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop(); 
                }
            } 
            else if (isOperator(c)) {
                while(!st.isEmpty() && isOperator(st.peek()) && getPrecedence(c) <= getPrecedence(st.peek())){
                    prefix.append(st.pop());
                }
                st.push(c);
            }
        }

        while (!st.isEmpty()) {
            prefix.append(st.pop());
        }

        return prefix.toString();
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
        reverse();
        String prefix = infixtoprefix1(infix);
        System.out.println("prefix: " + prefix);
        sc.close();
    }
}