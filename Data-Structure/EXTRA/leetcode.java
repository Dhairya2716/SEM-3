// HAPPY NUMBER


import java.util.Scanner;

/**
 * leetcode
 */
public class leetcode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        // n = 19
        int sum = 0;
        double remainder = 0;
        int temp = n;
          
            while(temp!=0){
                remainder = temp%10;
                sum += Math.pow(remainder,2);
                temp /= 10; 
            }
        System.out.println("Sum is : "+sum);
        sc.close();
    }
}