import java.util.*;

public class A_14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();
        int sum = 0;
        for(int i = a;i<=b;i++){
            sum += i;
        }
        System.out.println(sum);
        sc.close();
    }
}