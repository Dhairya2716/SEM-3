import java.util.Stack;
import java.util.Scanner;


public class B_48{

    public static int evaluatepostfix(String str){
        
        Stack<Integer> st = new Stack<>();

        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);


            if(Character.isDigit(c)){
                st.push(c - '0');
            }
            else{
                int val1 = st.pop();
                int val2 = st.pop();

                switch(c){
                    case '^':
                        st.push(val1^val2);
                        break;
                    case '*':
                        st.push(val1*val2);
                        break;
                    case '/':
                        st.push(val2/val1);
                        break;
                    case '+':
                        st.push(val1+val2);
                        break;
                    case '-':
                        st.push(val2-val1);
                        break;
                }
            }
        }
        // pop the operator use in this switch case
        return st.pop();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        String str = sc.nextLine();
        System.out.println("postfix-evalution is : "+evaluatepostfix(str));
        sc.close();
    }
}