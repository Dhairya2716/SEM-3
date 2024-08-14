public class closestpalindrome {
    public static void main(String[] args) {
        int num = 123;
        System.out.println("Closest palindrome to " + num + " is " + pal(num));
    }

    public static int pal(int num) {
        int lower = num - 1;
        int higher = num + 1;

        while (true) {
            if (isPalindrome(lower)) {
                return lower;
            }
            if (isPalindrome(higher)) {
                return higher;
            }
            lower--;
            higher++;
        }
    }

    public static boolean isPalindrome(int num) {
        int reversed = 0;
        int original = num;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }
}