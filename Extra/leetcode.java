public class leetcode {
   public static void main(String[] args) {
       int a = 5;
       int b = 7;
       System.out.println("Sum: " + addWithoutPlus(a, b));
   }

   public static int addWithoutPlus(int a, int b) {
       while (b != 0) {
           int carry = a & b;
           a = a ^ b;
           b = carry << 1;
       }
       return a;
   }
}