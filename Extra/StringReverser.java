import java.util.Stack;

public class StringReverser {
  public static String reverseString(String input) {
    Stack<Character> stack = new Stack<>();
    StringBuilder reversed = new StringBuilder();
    for (char c : input.toCharArray()) {
      stack.push(c);
    }
    while (!stack.isEmpty()) {
      reversed.append(stack.pop());
    }
    return reversed.toString();
  }

  public static void main(String[] args) {
    String input = "hello";
    String reversed = reverseString(input);
    System.out.println("Reversed string: " + reversed);
  }
}