import java.util.*;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number : ");
           int a = sc.nextInt();
           if(a%2==1){
            System.out.println("Weird");
           }
           else if(a%2==0){ 
            if(a>=2 && a<=5){
                System.out.println("Not wierd");
            }
            else if(a>=6 && a<=20){
                System.out.println("Wierd");
                System.out.println("even");
            }
            else if(a>20){
                System.out.println("Not Wierd");
            }
           }
           sc.close();
        }
    }

