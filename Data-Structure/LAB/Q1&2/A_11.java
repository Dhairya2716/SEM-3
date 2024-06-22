import java.util.Scanner;

public class A_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int add = 0;
        int sum = 0;
        for(int i = 1;i<=n;i++){
            add += i;
            sum += add;
        }
        System.out.println("Total sum is  : "+sum);
        sc.close();
    }
}
