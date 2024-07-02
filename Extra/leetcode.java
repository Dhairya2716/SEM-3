import java.util.*;
public class leetcode {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number : ");
      int num = sc.nextInt();
      int b = 0;
         if(num == 1){
            System.out.println("true");
         }
         if(num <= 0){
            System.out.println("False");
         }
         if(num == 2 || num == 5 || num == 3){
            System.out.println("true");
         }
         if(num % 2 == 0){
           b = (num / 2);
         }  
         if(num % 3 == 0){
           b = (num / 3);
         }
         if(num % 5 == 0){
           b = (num / 5);
         }
         System.out.println(b);
      System.out.println("False");
     
   } 
}