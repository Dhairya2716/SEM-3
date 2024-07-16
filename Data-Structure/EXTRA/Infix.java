import java.util.Stack;
import java.util.Scanner;
// infix to postfix code

    public static int prec(char c){
        if(c=='^'){
            return 3;
        }
        else if(c=='*'||c=='/'){
            return 2;
            }
            else if(c=='+'||c=='-'){
                return 1;
                }
                else{
                    return -1;
                    }
    }

    public static char 

public class Infix{

}