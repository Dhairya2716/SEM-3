import java.util.*;
import java.util.Stack;
import java.lang.*;
import java.io.*;

class reversevowel
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thenumber of test cases :");
        int T = sc.nextInt();
        sc.nextLine();

        while (T > 0) {
            System.out.println("Enter the length of the String :");
            int len = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the  String :");
            String s = sc.nextLine();

            Stack < Character > S = new Stack < > ();
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < len; i++) {
                char ch = s.charAt(i);
                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                    S.push(ch);
                } else {
                    while (!S.isEmpty()) {
                        result.append(S.pop());
                    }
                    result.append(ch);
                }
            }

            while (!S.isEmpty()) {
                result.append(S.pop());
            }

            System.out.println(result.toString());
            T--;
        }

        sc.close();
    }

}