import java.util.Scanner;
import java.util.Stack;

/**
 * C_44
 */
public class C_44 {

    public static void main(String[] args) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();
        int n = 0;
        String ans="";
        char ch = ' ';
        while (n != str.length()+1) {
            if(str.charAt(n) == 'a' || str.charAt(n) == 'e' || str.charAt(n) == 'i' || str.charAt(n) == 'o' || str.charAt(n) == 'u'){
                ch=stack1.pop();
                n++;
                ans+=ch;
                System.out.println(ans);
            }
            else{
                stack1.push(str.charAt(n));n++;
                ans+=str.charAt(n);
            }
            n++;
        }
        System.out.println(ans);
        
    }
}