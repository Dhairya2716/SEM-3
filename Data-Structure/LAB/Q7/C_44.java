import java.util.*;

public class C_44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String str = sc.next();
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])) {
                reverse(chars, 0, i - 1);
            }
        }

        System.out.println(new String(chars));
        sc.close();
    }

    public static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}