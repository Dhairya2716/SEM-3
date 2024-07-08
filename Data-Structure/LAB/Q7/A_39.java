import java.util.Scanner;
import java.util.Stack;

public class A_39 {
    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        
        for (int i = 0; i < str.length(); i++) {
            if (stack.pop() != str.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of names to be printed : ");
        int n = sc.nextInt();
        // String[] strings = {"aca", "bcb", "abcba", "abbcbba"};
        String[] strings = new String[n];
        System.out.println("Enter name : ");
        for (int i = 0; i < n; i++) {
            strings[i] = sc.next();
            }

        for (String str : strings) {
            if (isPalindrome(str)) {
                System.out.println(str + " is a palindrome.");
            } else {
                System.out.println(str + " is not a palindrome.");
            }
        }
        sc.close();
    }
}