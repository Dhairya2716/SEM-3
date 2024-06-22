import java.util.*;

public class Stack_practise {
    public static void main(String[] args) {
        Stack<String> Stack = new Stack<String>();
        Stack.push("Hello");
        Stack.push("Bro");
        Stack.push("How");
        Stack.push("are");
        Stack.push("you");
        // String Dj = Stack.pop();    ------->  to remove first top line or object...
        // System.out.println(Dj); 
        // System.out.println(Stack.search("Bro"));  --> to search location starts from 1.
        // Stack is LIFO(Last in First out); 
        System.out.println(Stack);
    }
}
