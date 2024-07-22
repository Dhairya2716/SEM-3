import java.util.Scanner;
import java.util.Stack;

// how many functions needed?
// 1. priority
// 2. operator -- done
// 3. digit or letter;
// 4. reverse


class prefix{

    // check for operator
    public static boolean isoperator(char c){
        return c == '^' || c == '/' || c == '*' || c == '+' || c == '-' ; 
    }

    public static int getPrecedence(char c){
        switch (c) {
            case '^':
                return 3;
            case '/':
            case '*':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }
    static String solve(String str){
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder(str);
        
        sb = sb.reverse();
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == ')') {
                sb = sb.replace(i,i+1, "(");
            }
            else if (sb.charAt(i) == ('(')) {
                sb = sb.replace(i,i+1, ")");
            }
        }
    
        for (int i = 0 ; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            } 
            else if(c == '('){
                st.push(c);
            } 
            else if(c == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    sb.append(st.pop());
                }
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop(); 
                }
            } 
            else if (isoperator(c)) {
                while(!st.isEmpty() && isoperator(st.peek()) && getPrecedence(c) <= getPrecedence(st.peek())){
                    sb.append(st.pop());
                }
                st.push(c);
            }
        }

        return sb.reverse().toString();
    
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the infix  Expression :");
        String str = sc.nextLine(); 
        String ans = solve(str);
        
        System.out.println(ans);
        sc.close();

    }
}
