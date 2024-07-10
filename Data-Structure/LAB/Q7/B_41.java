import java.util.Scanner;
import java.util.Stack;
class B_41{
public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char it : s.toCharArray()) {
            if (it == '(' || it == '[' || it == '{')
                stack.push(it);
            else {
                if(stack.isEmpty()) return false;
                char ch = stack.pop(); 
                if((it == ')' && ch == '(') ||  (it == ']' && ch == '[') || (it == '}' && ch == '{')) continue;
                else return false;
            }
        }
        return stack.isEmpty();
    }

 public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		// String s="()[{}()]";
        System.out.println("Enter a String : ");
        String s = sc.next();
		if(isValid(s)==true)
		System.out.println("True");
		else
		System.out.println("False");
        sc.close();
	}
}