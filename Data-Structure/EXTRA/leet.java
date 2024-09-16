
class Solution {

    public int calculate(String s) {

        Stack<Integer> st = new Stack<>();
        int num = 0;
        int sign = 1;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '+') {
                result += sign * num;
                sign = 1;
                num = 0;
            } else if (c == '-') {
                result += sign * num;
                sign = -1;
                num = 0;
            } else if (c == '*') {
                int multiply = 0;
                while (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                    i++;
                    multiply = multiply * 10 + (s.charAt(i) - '0');
                }
                num *= multiply;
            } else if (c == '/') {
                int divisor = 0;
                while (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                    i++;
                    divisor = divisor * 10 + (s.charAt(i) - '0');
                }
                if (divisor != 0) {
                    num /= divisor;
                }
            } else if (c == '(') {
                st.push(result);
                st.push(sign);
                sign = 1;
                num = 0;
            } else if (c == ')') {
                result += sign * num;
                num = 0;
                result = st.pop() + st.pop() * result;
            }
        }
        result += sign * num;
        return result;
    }
}
