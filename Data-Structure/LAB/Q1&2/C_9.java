import java.util.Scanner;

public class C_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of seconds : ");
        int s = sc.nextInt();
        int m = 0;
        int h = 0;
        while(s>=60){
            m++;
            s = s-60;
        }
        while(m>=60){
            h++;
            m = m-60;
        }
        if(h<12){
            System.out.println("Time is "+h+"::"+m+"::"+s+" am");
        }
        else{
            System.out.println("Time is "+h+"::"+m+"::"+s+" pm");
        }
        sc.close();
    }
}