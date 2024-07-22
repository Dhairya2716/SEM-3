
import java.util.Scanner;

class Queueoperation{
    int F,R = -1;
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr = new int[n];
    public void enque(int x){
        if(R>= arr.length-1){
            System.out.println("Queue overflow");
            return;
        }
        n++;
        F = 0;
        R++;
        arr[R]=x;
    }
    public void display(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

public class enque {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queueoperation q1 = new Queueoperation();
        String ch="y"; 
        while(ch!="n"){
            System.out.println("Want to add:");
            ch=sc.next();
            if(ch.equals("y")){
                System.out.println("Enter value to add:");
                int x=sc.nextInt();
                q1.enque(x);
                return;
            }
            break;
        }
        q1.display();
    }
}
