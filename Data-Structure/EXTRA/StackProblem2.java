import java.util.Stack;


public class StackProblem2 {

    static Stack<Integer> myS = new Stack<Integer>();
    
    static void insertatbottom(int data){
        if(myS.isEmpty()){
            myS.push(data);
            }
            else{
               int prevData = myS.peek();
               myS.pop();
               insertatbottom(data);
               myS.push(prevData);
        }
    }

    static void reverse(){
        if(myS.isEmpty()){
            return;
        }
        int data = myS.peek();
        myS.pop();
        reverse(); 

        insertatbottom(data);
    }


    public static void main(String[] args) {
        myS.push(10);
        myS.push(20);
        myS.push(30);
        myS.push(40);
        myS.push(50);

        System.out.println(myS);

        reverse();

        System.out.println(myS);
    }
} 