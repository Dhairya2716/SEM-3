import java.util.*;
public class A_33{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.println("Orignal number is "+a+" , "+b);
        swap(a,b);
        sc.close();
    }
    public static void swap(int a,int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped number is : "+a+" , "+b);
    }
}