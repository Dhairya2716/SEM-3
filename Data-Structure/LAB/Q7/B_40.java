import java.util.Stack;

public class B_40 {
    public static boolean isAiBi(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == 'a') {
                stack.push(c);
            } else if (c == 'b') {
                if (stack.isEmpty() || stack.pop()!= 'a') {
                    return false;
                }
            } else {
                return false; 
            }
        }

        return stack.isEmpty(); 
    }

    public static void main(String[] args) {
        System.out.println(isAiBi("aabb")); 
        System.out.println(isAiBi("aaabbb")); 
        System.out.println(isAiBi("aabbb")); 
        System.out.println(isAiBi("abc")); 
    }
}