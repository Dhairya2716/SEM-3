import java.util.*;

public class A_6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base value : ");
        int a = sc.nextInt();
        System.out.println("Enter value of power : ");
        int b = sc.nextInt();
        int v = 1;
        for(int i = 1;i<=b;i++){
            v = v*a;
        }
        System.out.println("Answer is : "+v);
        sc.close();
    }
}