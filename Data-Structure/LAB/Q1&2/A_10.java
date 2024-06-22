import java.util.Scanner;

public class A_10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days : ");
        int no_days = sc.nextInt();
        int w = 7;
        int year = no_days / 365;
        int week = (no_days % 365)/w;
        int day = (no_days % 365)%w;
        System.out.println("years : "+year);
        System.out.println("Weeks : "+week);
        System.out.println("Days : "+day);
        sc.close();
    }
}