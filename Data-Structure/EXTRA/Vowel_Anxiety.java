import java.util.Scanner;
import java.util.Stack;

public class Vowel_Anxiety {
    public static void main(String[] args) {
        Stack<Character> stack1 = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();
        int n = 0;
        String ans = "";
        char ch = ' ';

        // Initialize stack1 with vowels
        stack1.push('a');
        stack1.push('e');
        stack1.push('i');
        stack1.push('o');
        stack1.push('u');

        while (n < str.length()) {
            if (str.charAt(n) == 'a' || str.charAt(n) == 'e' || str.charAt(n) == 'i' || str.charAt(n) == 'o' || str.charAt(n) == 'u') {
                if (!stack1.isEmpty()) {
                    ch = stack1.pop();
                    ans += str.charAt(n);
                    ans += ch;
                } else {
                    ans += str.charAt(n);
                }
            } else {
                stack1.push(str.charAt(n));
                ans += str.charAt(n);
            }
            n++;
        }
        System.out.println(ans);
        sc.close(); 
    }
}