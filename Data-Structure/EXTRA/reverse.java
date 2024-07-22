import java.util.Scanner;
import java.util.Stack;

public class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String str = sc.next();

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            char c = stack.pop();
            if (isVowel(c)) {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
            }
            result.append(c);
        }

        System.out.println(result.toString());
        sc.close();
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}