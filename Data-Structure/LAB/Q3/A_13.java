import java.util.Scanner;

/**
 * A_13
 */
public class A_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of size: ");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            System.out.println("The element"+i+"is"+a[i]);
        }
        sc.close();
    }
}