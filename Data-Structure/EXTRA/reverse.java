import java.util.Scanner;
import java.util.Stack;
/**
 * reverse
 */
public class reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String InputString;
        InputString = sc.nextLine();
        ReverseWords reverseWorldsObject = new ReverseWords();
        System.out.println(reverseWorldsObject.ReverseWords(InputString));
    }

    class ReverseWords{
        String ReverseWords(String s){
            String output = "";
            Character temp;
            Stack<Character> st = new Stack<Character>();
            for(int i = 0;i<s.length();i++){
                char CurrentChar = s.charAt(i);
                if(Character.isLetterOrDigit(CurrentChar)){
                    st.push(CurrentChar);
                }
                else{
                    while(!st.empty()){
                        temp = st.pop();
                        output = output.concat(Character.toString(temp));
                    }
                    output = output.concat(Character.toString(CurrentChar));
            } 
        }
        while(!st.empty()){
            temp = st.pop();
            output = output.concat(Character.toString(temp));
            }
            return output;
    }
}
}