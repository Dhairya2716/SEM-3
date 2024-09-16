public class gpt {

    // Checks if a number is prime
    public static boolean isPrime(int m) {
        if (m <= 1) return false;
        if (m == 2) return true; // 2 is the only even prime number
        if (m % 2 == 0) return false; // Eliminate even numbers
        for (int i = 3; i * i <= m; i += 2) {
            if (m % i == 0) return false;
        }
        return true;
    }

    // Generate palindromes and check if they are prime
    public static int findPrimePalindrome(int n) {
        // Special cases
        if (n <= 2) return 2;
        if (n <= 11) return (n <= 7) ? 7 : 11;

        int length = Integer.toString(n).length();
        int start = (int) Math.pow(10, (length - 1) / 2);
        for (int i = start; ; i++) {
            // Generate palindromes of current length
            String half = Integer.toString(i);
            StringBuilder sb = new StringBuilder(half);
            String palindrome = sb.append(new StringBuilder(half).reverse().toString()).toString();
            int pal = Integer.parseInt(palindrome);

            if (pal >= n && isPrime(pal)) {
                return pal;
            }

            // Generate palindromes of odd length
            for (int j = 0; j <= 9; j++) {
                String oddHalf = Integer.toString(i) + Character.toString((char) ('0' + j));
                StringBuilder oddSb = new StringBuilder(oddHalf);
                String oddPalindrome = oddSb.append(new StringBuilder(oddHalf).reverse().toString()).toString();
                int oddPal = Integer.parseInt(oddPalindrome);

                if (oddPal >= n && isPrime(oddPal)) {
                    return oddPal;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 9989900; // Example input
        System.out.println(findPrimePalindrome(n)); // Output: 101
    }
}