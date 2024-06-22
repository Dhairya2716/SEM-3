import java.util.*;

/**
 * A_15
 */
public class A_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        int sum = 0;
        for(int i = 0;i<=a;i++){
            sum += i;
        }
        sum = sum/a;
        System.out.println(sum);
        sc.close();
    }
}